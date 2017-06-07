package org.usfirst.frc.team9999.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team9999.robot.commands.CANTalon1Command;
import org.usfirst.frc.team9999.robot.commands.CANTalon2Command;
import org.usfirst.frc.team9999.robot.commands.DoubleSolenoidCommand;
import org.usfirst.frc.team9999.robot.commands.Servo1Command;
import org.usfirst.frc.team9999.robot.commands.Servo2Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public XboxControllerUD xboxPilot;
	public OI() {
		xboxPilot = new XboxControllerUD(0);

		xboxPilot.a.toggleWhenPressed(new CANTalon1Command());
		xboxPilot.x.toggleWhenPressed(new CANTalon2Command());
		xboxPilot.y.toggleWhenPressed(new DoubleSolenoidCommand());
		xboxPilot.rb.toggleWhenPressed(new Servo2Command());
		xboxPilot.b.toggleWhenPressed(new Servo1Command());
		
		
	}
	public XboxControllerUD getXboxPilot() {
		return xboxPilot;
	}

}

