package org.usfirst.frc.team6479.robot.commands;

import org.usfirst.frc.team6479.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
//move gear collector up for set number of seconds at speed defined by the subsystem
/*public class GearPickUp extends TimedCommand {

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
}*/
public class GearPickUp extends Command {

	public GearPickUp() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.gycont);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.gycont.pickUp();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.gycont.getSwitch().get();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.gycont.stop();
		Scheduler.getInstance().add(new GearStayUp());
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
