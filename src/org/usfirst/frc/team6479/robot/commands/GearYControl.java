package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearYControl extends Command {

	public GearYControl() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.gycont);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		boolean buttonPressed = Robot.oi.getXboxAssist().getRawButton(6);
		
		//control gear lift based on button
		//this is a test below
		if(buttonPressed){
			Robot.gycont.pickUp();
		}
		
		if (buttonPressed && Robot.gycont.isUp()) {
			Robot.gycont.drop();
		}
		if (buttonPressed && !Robot.gycont.isUp()) {
			Robot.gycont.drop();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
