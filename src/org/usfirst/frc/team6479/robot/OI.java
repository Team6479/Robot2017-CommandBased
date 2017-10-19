package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.commands.Climb;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	// refrence to the xbox controller
	private XboxController xboxDriver = new XboxController(0);
	private XboxController xboxAssist = new XboxController(1);

	public OI() {
		
	}

	public XboxController getXboxDriver() {
		return xboxDriver;
	}
	
	public XboxController getXboxAssist() {
		return xboxAssist;
	}

}
