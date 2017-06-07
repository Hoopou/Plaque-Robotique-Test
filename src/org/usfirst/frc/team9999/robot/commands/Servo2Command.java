package org.usfirst.frc.team9999.robot.commands;

import org.usfirst.frc.team9999.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Servo2Command extends Command {
	public static int mode = 1;
	
	public Servo2Command() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.Servo2);
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
			Robot.Servo2.retract();
			break;
		case 1:
			Robot.Servo2.extend();
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
		Robot.Servo2.retract();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
