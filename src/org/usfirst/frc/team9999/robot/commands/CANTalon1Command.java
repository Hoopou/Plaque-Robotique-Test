package org.usfirst.frc.team9999.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team9999.robot.Robot;

/**
 *
 */
public class CANTalon1Command extends Command {
	public static int mode = 1;
	
	public CANTalon1Command() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.CAN1Subsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		switch(mode){
		case 0:
			Robot.CAN1Subsystem.arreter();
			break;
		case 1:
			Robot.CAN1Subsystem.Commancer();
			break;
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.CAN1Subsystem.arreter();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
