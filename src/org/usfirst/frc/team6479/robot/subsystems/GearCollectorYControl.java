package org.usfirst.frc.team6479.robot.subsystems;

import org.usfirst.frc.team6479.robot.RobotMap;
import org.usfirst.frc.team6479.robot.commands.GearYControl;
import org.usfirst.frc.team6479.robot.commands.RacingDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollectorYControl extends Subsystem {
	
	private Spark spark;
	//wether up or down
	private enum Position {
		UP, DOWN
	}
	//current posiuton
	private Position pos;
	
	public GearCollectorYControl() {
		spark = new Spark(RobotMap.yControl);
		//default psoition
		pos = Position.UP;
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new GearYControl());
		
	}
	//what psoiton it is
	public boolean isUp() {
		return pos == Position.UP;
	}
	
	//lift the gear collector up
	public void pickUp() {
		//if its up, dont do it
		if(pos == Position.UP) {
			// TODO: pick up code
			
			//after picked up, set posotion to UP
			pos = Position.UP;
		}
	}
	//drop the gear collector down
	public void drop() {
		//if its down, dont do it
		if(pos == Position.DOWN) {
			// TODO: drop code
			
			//after picked up, set posotion to UP
			pos = Position.DOWN;
		}
	}
	
}
