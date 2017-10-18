package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnGearWheels extends Command {

	private int counter;

	public TurnGearWheels() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.gwheels);
		
		//Initalization of variables
		counter = 0;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		// Checks for Left Button
		boolean lButtonValue = Robot.oi.getXboxAssist().getRawButton(5);
		// Checks for Right Button
		boolean rButtonValue = Robot.oi.getXboxAssist().getRawButton(6);

		if (counter == 20) {
			//If Left Button is pressed 
			if (lButtonValue) {
				boolean isOn = false;
				if (!isOn) {
					Robot.gwheels.set(1);
				}
				else{
					Robot.gwheels.set(0);
				}
			} 
			else if (rButtonValue) {
				boolean isOn = false;
				if (!isOn) {
					Robot.gwheels.set(-1);
				}
				else{
					Robot.gwheels.set(0);
				}
			}
			counter = 0;
		}
		counter++;
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
