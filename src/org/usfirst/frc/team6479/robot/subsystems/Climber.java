package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.Climb;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {

	private Victor climber = new Victor(RobotMap.climber);

	//no default
	public void initDefaultCommand() {
		setDefaultCommand(new Climb());
	}
	public void climb(double speed) {
		//never go in reverse
		double robotSpeed = Math.abs(speed);
		climber.set(robotSpeed);
	}
}

