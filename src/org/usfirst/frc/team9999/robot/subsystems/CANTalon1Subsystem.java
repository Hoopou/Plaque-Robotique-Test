package org.usfirst.frc.team9999.robot.subsystems;



import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CANTalon1Subsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static CANTalon moteurX;
	
	public CANTalon1Subsystem(){
		moteurX = new CANTalon(1);  // 1 = CanTalon ID
	}

	public void initDefaultCommand() {}
	
	
	public void Commancer() {
		moteurX.set(1);	/// 1 = speed
	}

	public void arreter() {
		moteurX.set(0); 
	}
}
