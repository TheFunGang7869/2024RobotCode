// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.Constants.ScissorLiftConstants;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ScissorLift extends SubsystemBase {

  private WPI_VictorSPX scissorSPX;
  private final AnalogPotentiometer pot;

  public ScissorLift() {

    scissorSPX = new WPI_VictorSPX(ScissorLiftConstants.scissorLiftMotorID);
    pot = new AnalogPotentiometer(2, 100, 0);

  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Scissor lift position", getLiftPosition());
  }

  public double getLiftPosition() {
    return pot.get();
  }

  public void turnoff() {
    scissorSPX.set(0.0);
  }

  public void cleave() {
    scissorSPX.set(ScissorLiftConstants.scissorLiftUpPower);
  }

  public void dismantle() {
    scissorSPX.set(ScissorLiftConstants.scissorLiftDownPower);
  }

}
