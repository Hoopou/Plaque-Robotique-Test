package org.usfirst.frc.team5865.robot.subsystems;



import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Servo2Subsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static Servo servo1;
	
	public Servo2Subsystem(){
		servo1 = new Servo(0); 
	}

	public void initDefaultCommand() {}
	
	
	public void extend() {
		servo1.set(0.8);
	}

	public void retract() {
		servo1.set(0.2);
	}
}
