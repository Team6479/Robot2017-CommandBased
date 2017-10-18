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
	//whether up or down
	private enum Position {
		UP, DOWN
	}
	
	//timer for pickup
	Timer timer;
	
	//current position
	private Position pos;
	
	public GearCollectorYControl() {
		spark = new Spark(RobotMap.yControl);
		//default position
		pos = Position.DOWN;
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new GearYControl());
		
	}
	//what position it is
	public boolean isUp() {
		return pos == Position.UP;
	}
	
	//lift the gear collector up
	public void pickUp() {
		//if it's up, don't do it
		if(pos == Position.DOWN) {
			// TODO: pick up code
			spark.set(0.4);
			//after picked up, set position to UP
			pos = Position.UP;
		}
	}
	//drop the gear collector down
	public void drop() {
		//if its down, don't do it
		if(pos == Position.UP) {
			// TODO: drop code
			
			//after picked up, set position to UP
			pos = Position.DOWN;
		}
	}
	public SpeedController getMotor() {
		return spark;
	}
	public void stop() {
		spark.set(0);
	}
	
}
