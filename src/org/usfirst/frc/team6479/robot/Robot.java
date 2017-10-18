
package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.auto.AutoLogger;
import org.usfirst.frc.team6479.robot.subsystems.Climber;
import org.usfirst.frc.team6479.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6479.robot.subsystems.GearCollectorWheels;
import org.usfirst.frc.team6479.robot.subsystems.GearCollectorYControl;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//import robotLogger.RobotLogger;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static OI oi;
	public static Climber climber;
	public static GearCollectorWheels gwheels;
	public static GearCollectorYControl gycont;
	//public RobotLogger logger;
	
	//was the auto logger successful in opening
	private boolean autoSuccess;
	//whether or not the robot should learn a new auto
	private boolean learnAuto;
	//logger for auto
	private AutoLogger autoLogger;

	@Override
	public void robotInit() {
		drivetrain = new Drivetrain();
		climber = new Climber();
		gwheels = new GearCollectorWheels();
		gycont = new GearCollectorYControl();
		oi = new OI();
		//logging utility
		//logger = RobotLogger.getInstance();
		
		//setup autonomous chooser in dashboard
		SmartDashboard.putString("DB/String 9", "autonomous");
		SmartDashboard.putBoolean("DB/Button 0", false);
	}
	@Override
	public void autonomousInit() {
		//create the autoLogger
		autoLogger = new AutoLogger(drivetrain.getLeftSideMotors(), drivetrain.getRightSideMotors(), 
				climber.getMotor(), gwheels.getMotor(), gycont.getMotor());
		//open the logger at the file location in the dashboard
		autoSuccess = autoLogger.openForRead(SmartDashboard.getString("DB/String 9", "autonomous"));
	}
	@Override
	public void autonomousPeriodic() {
		if(autoSuccess && isAutonomous()) {
			boolean continueAuto = autoLogger.run();
			//run until end of auto routine is reached, then set all motors to zero and wait until time runs out
			if(!continueAuto) {
				autoLogger.stop();
			}
		}
	}
	@Override
	public void teleopInit() {
		//whether or not the robot should learn a new auto
		learnAuto = SmartDashboard.getBoolean("DB/Button 0", false);
		//if it should learn a new auto, make the logger, then open the logger
		if(learnAuto) {
			autoLogger = new AutoLogger(drivetrain.getLeftSideMotors(), drivetrain.getRightSideMotors(), 
					climber.getMotor(), gwheels.getMotor(), gycont.getMotor());
			autoSuccess = autoLogger.openForRead(SmartDashboard.getString("DB/String 9", "autonomous"));
		}
	}
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		//log auto
		if(learnAuto) {
			autoLogger.log();
		}
	}
	@Override
	public void disabledInit() {
		//when robot is disabled, if robot was learning a new auto the logger needs to be notified and save the log
		//if the auto just ran, the logger also needs to be notified
		if(learnAuto) {
			autoLogger.closeWrite();
		}
		if(autoSuccess) {
			autoLogger.closeRead();
		}
		
		//stop all subsystens
		drivetrain.stop();
		climber.stop();
		gwheels.stop();
		gycont.stop();
		
	}
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
