// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Moter extends SubsystemBase {
  /** Creates a new moter. */
  int x = 0;
  CANSparkMax motter = new CANSparkMax(14, CANSparkMax.MotorType.kBrushless);
  CANSparkMax motter2 = new CANSparkMax(15, CANSparkMax.MotorType.kBrushless);
  public Moter() {}

  public void runMoter() {
    motter.set(0.35);
    motter2.set(.35);
  }
  public void stopMoter(){
    motter.set(0);
    motter2.set(0);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
