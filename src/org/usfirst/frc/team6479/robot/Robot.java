
package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.subsystems.Climber;
import org.usfirst.frc.team6479.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6479.robot.subsystems.GCollectorWheels;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static OI oi;
	public static Climber climber;
	public static GCollectorWheels gwheels;

	@Override
	public void robotInit() {
		oi = new OI();
		drivetrain = new Drivetrain();
		climber = new Climber();
		gwheels = new GCollectorWheels();
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
