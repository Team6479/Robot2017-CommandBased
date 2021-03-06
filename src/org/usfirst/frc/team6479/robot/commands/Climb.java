package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {

	public Climb() {
		//Use requires() here to declare subsystem dependencies
		requires(Robot.climber);
	}
	//Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}
	//Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(Robot.oi.getXboxDriver().getRawButton(6))
		{
			//get the joystick value and climb
			double joystickValue = Robot.oi.getXboxDriver().getRawAxis(5);
			Robot.climber.climb(Math.abs(joystickValue));
		}
		else {
			Robot.climber.climb(0);
		}
	}
	//Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}
	//Called once after isFinished returns true
	@Override
	protected void end() {
		//stop
		Robot.climber.climb(0);
	}
	//Called when another command which requires one or more of the same subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
