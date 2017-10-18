package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.GearYControl;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollectorYControl extends Subsystem {
	
	private Spark spark;
	//whether up or down
	private enum Position {
		UP, DOWN
	}
	//current position
	private Position pos;
	
	public GearCollectorYControl() {
		spark = new Spark(RobotMap.yControl);
		//default position
		pos = Position.UP;
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
		spark.set(0.4); //test
		if(pos == Position.UP) {
			// TODO: pick up code
			
			//after picked up, set position to UP
			pos = Position.UP;
		}
	}
	//drop the gear collector down
	public void drop() {
		//if its down, don't do it
		if(pos == Position.DOWN) {
			// TODO: drop code
			
			//after picked up, set position to UP
			pos = Position.DOWN;
		}
	}
	
}
