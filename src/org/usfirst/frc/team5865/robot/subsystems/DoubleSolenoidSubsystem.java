package org.usfirst.frc.team5865.robot.subsystems;



import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DoubleSolenoidSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static DoubleSolenoid solenoid;
	
	public DoubleSolenoidSubsystem(){
		solenoid = new DoubleSolenoid(0, 3); 
	}

	public void initDefaultCommand() {
		
	}
	
	
	public void extend() {
		solenoid.set(DoubleSolenoid.Value.kForward);
	}

	public void retract() {
		solenoid.set(DoubleSolenoid.Value.kReverse);
	}
}
