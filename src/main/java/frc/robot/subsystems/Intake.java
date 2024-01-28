// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase {

private WPI_VictorSPX intakeSPX;
  public Intake() {

    intakeSPX = new WPI_VictorSPX(IntakeConstants.intakeMotorID);

  }
public void turnoff(){
  intakeSPX.set(0.0);
}
public void dash(){
  intakeSPX.set(IntakeConstants.intakeForwardPower);
}
public void moonwalk(){
  intakeSPX.set(IntakeConstants.intakeBackwardPower);
}

}
