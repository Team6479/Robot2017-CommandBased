package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.GearYControl;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollectorYControl extends Subsystem {

	private Spark spark;
	private DigitalInput limitSwitch;

	// timer for pickup
	Timer timer;

	public GearCollectorYControl() {
		spark = new Spark(RobotMap.yControl);
		limitSwitch = new DigitalInput(RobotMap.lSwitch);

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
	
	// lift the gear collector up at a set speed.
	public void stayUp() {
		spark.set(0.25);
	}

	public SpeedController getMotor() {
		return spark;
	}

	public void stop() {
		spark.set(0);
	}
	
	public boolean switchTriggered() {
		return limitSwitch.get();
	}

}
