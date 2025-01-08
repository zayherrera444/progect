// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveBase;
public class JoystickDrive extends Command {
  /** Creates a new JoystickDrive. */
  Joystick joystick = new Joystick(0);

  DriveBase drive;


  public JoystickDrive(DriveBase subsystem) {
    addRequirements(subsystem);
    drive = subsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }
  public double getRightY(){
    return joystick.getRawAxis(3);
  }
  public double getLeftY(){
    return joystick.getRawAxis(1);
  }
  public double getLeftX(){
    return joystick.getRawAxis(0);
  }
  public double getRightX(){
    return joystick.getRawAxis(2);
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.setDriveSpeed(getLeftY());

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
