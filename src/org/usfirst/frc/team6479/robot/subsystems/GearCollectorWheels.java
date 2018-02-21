package org.usfirst.frc.team6479.robot.subsystems;
import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.TurnGearWheels;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollectorWheels extends Subsystem {
	
	private Relay spike;
	
	public GearCollectorWheels() {
		spike = new Relay(0);
		spike.set(Relay.Value.kOff);
	
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TurnGearWheels());
	}
	
	public void set(double var)
	{
		if(var == 1)
			spike.set(Relay.Value.kForward);
		else if(var == -1)
			spike.set(Relay.Value.kReverse);
		else
			spike.set(Relay.Value.kOff);
	}
	public Relay getMotor() {
		return spike;
	}
	public void stop() {
		spike.set(Relay.Value.kOff);
		
	}
	
}  
