package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
//move gear collector up for set number of seconds at speed defined by the subsystem
public class GearPickUp extends TimedCommand {

    public GearPickUp(double timeout) {
        super(timeout);
        requires(Robot.gycont);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		Robot.gycont.pickUp();
    		
    }

    // Called once after timeout
    protected void end() {
    		Robot.gycont.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
