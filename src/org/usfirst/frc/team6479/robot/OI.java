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
	private XboxController xbox1 = new XboxController(0);
	private XboxController xbox2 = new XboxController(1);

	public OI() {
		// indiviual refrences to the xbox controllers buttons, does not include
		// triggers, joysticks, or dpad
		
		//Xbox Controller 1 (Driver)
		JoystickButton aButton1 = new JoystickButton(xbox1, 1);
		JoystickButton bButton1 = new JoystickButton(xbox1, 2);
		JoystickButton xButton1 = new JoystickButton(xbox1, 3);
		JoystickButton yButton1 = new JoystickButton(xbox1, 4);
		JoystickButton leftBumperButton1 = new JoystickButton(xbox1, 5);
		JoystickButton rightBumperButton1 = new JoystickButton(xbox1, 6);
		JoystickButton backButton1 = new JoystickButton(xbox1, 7);
		JoystickButton startButton1 = new JoystickButton(xbox1, 8);
		JoystickButton leftStickButton1 = new JoystickButton(xbox1, 9);
		JoystickButton rightStickButton1 = new JoystickButton(xbox1, 10);
		
		//Xbox Controller 2 (Assistant)
		JoystickButton aButton2 = new JoystickButton(xbox2, 1);
		JoystickButton bButton2 = new JoystickButton(xbox2, 2);
		JoystickButton xButton2 = new JoystickButton(xbox2, 3);
		JoystickButton yButton2 = new JoystickButton(xbox2, 4);
		JoystickButton leftBumperButton2 = new JoystickButton(xbox2, 5);
		JoystickButton rightBumperButton2 = new JoystickButton(xbox2, 6);
		JoystickButton backButton2 = new JoystickButton(xbox2, 7);
		JoystickButton startButton2 = new JoystickButton(xbox2, 8);
		JoystickButton leftStickButton2 = new JoystickButton(xbox2, 9);
		JoystickButton rightStickButton2 = new JoystickButton(xbox2, 10);
		
		rightBumperButton1.whileHeld(new Climb());
	}

	public XboxController getXbox1() {
		return xbox1;
	}
	
	public XboxController getXbox2() {
		return xbox2;
	}

}
