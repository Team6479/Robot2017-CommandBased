package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearStayUp extends Command {

    public GearStayUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(Robot.gycont);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		//if the swicth is open
    		if(Robot.gycont.getSwitch().get()) {
    			Robot.gycont.pickUp();
    		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.oi.getXboxAssist().getRawButton(0);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gycont.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
