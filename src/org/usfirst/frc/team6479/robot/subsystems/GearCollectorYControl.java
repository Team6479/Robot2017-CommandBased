package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.GearYControl;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollectorYControl extends Subsystem {

	private Spark spark;

	// timer for pickup
	Timer timer;

	public GearCollectorYControl() {
		spark = new Spark(RobotMap.yControl);

		// init timer
		timer = new Timer();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new GearYControl());

	}

	// lift the gear collector up at a set speed.
	public void pickUp() {
		spark.set(0.4);
	}

	public SpeedController getMotor() {
		return spark;
	}

	public void stop() {
		spark.set(0);
	}

}
