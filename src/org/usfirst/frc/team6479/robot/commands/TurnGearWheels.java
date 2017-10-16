package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnGearWheels extends Command {

    public TurnGearWheels() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.gwheels);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gwheels.set(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		boolean buttonValue = Robot.oi.getXboxAssist().getRawButton(5);
    		Robot.gwheels.set(buttonValue);
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
