package org.usfirst.frc.team5865.robot.subsystems;



import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CANTalon2Subsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static WPI_TalonSRX moteurX;
	
	public CANTalon2Subsystem(){
		moteurX = new WPI_TalonSRX(2);  // 1 = CanTalon ID
	}

	public void initDefaultCommand() {}
	
	
	public void Commancer() {
		moteurX.set(1);	/// 1 = speed
	}

	public void arreter() {
		moteurX.set(0); 
	}
}
