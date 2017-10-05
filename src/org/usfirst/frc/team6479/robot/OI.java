package org.usfirst.frc.team6479.robot;

import org.usfirst.frc.team6479.robot.commands.Climb;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	// refrence to the xbox controller
	private XboxController xbox = new XboxController(0);

	public OI() {
		// indiviual refrences to the xbox controllers buttons, does not include
		// triggers, joysticks, or dpad
		JoystickButton aButton = new JoystickButton(xbox, 1);
		JoystickButton bButton = new JoystickButton(xbox, 2);
		JoystickButton xButton = new JoystickButton(xbox, 3);
		JoystickButton yButton = new JoystickButton(xbox, 4);
		JoystickButton leftBumperButton = new JoystickButton(xbox, 5);
		JoystickButton rightBumperButton = new JoystickButton(xbox, 6);
		JoystickButton backButton = new JoystickButton(xbox, 7);
		JoystickButton startButton = new JoystickButton(xbox, 8);
		JoystickButton leftStickButton = new JoystickButton(xbox, 9);
		JoystickButton rightStickButton = new JoystickButton(xbox, 10);
		
		rightBumperButton.whileHeld(new Climb());
	}

	public XboxController getXbox() {
		return xbox;
	}

}
