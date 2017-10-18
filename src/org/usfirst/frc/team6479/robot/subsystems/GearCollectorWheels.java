package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.TurnGearWheels;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollectorWheels extends Subsystem {
	
	private Spark spark;
	
	public GearCollectorWheels() {
		spark = new Spark(RobotMap.wheels);
		//set the spark in reverse
		spark.setInverted(true);
		spark.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TurnGearWheels());
	}
	
	public void set(double var)
	{
		spark.set(var);
	}
	public SpeedController getMotor() {
		return spark;
	}
	public void stop() {
		spark.set(0);
	}
	
}  
