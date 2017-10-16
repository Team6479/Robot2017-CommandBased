
package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.subsystems.Climber;
import org.usfirst.frc.team6479.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6479.robot.subsystems.GearCollectorWheels;
import org.usfirst.frc.team6479.robot.subsystems.GearCollectorYControl;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//import robotLogger.RobotLogger;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static OI oi;
	public static Climber climber;
	public static GearCollectorWheels gwheels;
	public static GearCollectorYControl gycont;
	//public RobotLogger logger;

	@Override
	public void robotInit() {
		drivetrain = new Drivetrain();
		climber = new Climber();
		gwheels = new GearCollectorWheels();
		gycont = new GearCollectorYControl();
		oi = new OI();
		//logging utiltiy
		//logger = RobotLogger.getInstance();
	}
	@Override
	public void disabledInit() {

	}
	@Override
	public void disabledPeriodic() {
		//run commands
		Scheduler.getInstance().run();
	}
	@Override
	public void teleopInit() {
		//if need to record new auto
	}
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
