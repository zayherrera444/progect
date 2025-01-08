// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;

public class DriveBase extends SubsystemBase {
  
  CANSparkMax frontRight = new CANSparkMax(3, CANSparkMax.MotorType.kBrushless);
  CANSparkMax frontLeft = new CANSparkMax(1, CANSparkMax.MotorType.kBrushless);
  CANSparkMax backLeft = new CANSparkMax(5, CANSparkMax.MotorType.kBrushless);
  CANSparkMax backRight = new CANSparkMax(7, CANSparkMax.MotorType.kBrushless);
  /** Creates a new driveBase. */
  public DriveBase() {}

  public void setDriveSpeed(double x){
    frontRight.set(x);
    frontLeft.set(x);
    backLeft.set(x);
    backRight.set(x);
  }
  public void driveForward(double x){
    setDriveSpeed(x);
  }
  public void driveBackwards(double x){
    setDriveSpeed(-x);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
