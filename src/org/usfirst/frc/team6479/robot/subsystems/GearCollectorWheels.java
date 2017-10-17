package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.TurnGearWheels;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollectorWheels extends Subsystem {
	
	private Relay spike;
	
	public GearCollectorWheels(){
		spike = new Relay(RobotMap.wheels);
		spike.set(Value.kOff);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TurnGearWheels());
	}
	
	public void set(boolean btnpress) {
		if (btnpress) {
			spike.set(Relay.Value.kOn);
		}
		else {
			spike.set(Relay.Value.kOff);
		}
	}
	public void set(Relay.Value var)
	{
		spike.set(var);
	}
	
	
}  
