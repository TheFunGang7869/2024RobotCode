// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants.ScissorLiftConstants;

public class ScissorLift extends SubsystemBase {

private WPI_TalonSRX scissorSRX;
  public ScissorLift() {

    scissorSRX = new WPI_TalonSRX(ScissorLiftConstants.scissorLiftMotorID);

  }
public void turnoff(){
  scissorSRX.set(0.0);
}
public void cleave(){
  scissorSRX.set(ScissorLiftConstants.scissorLiftUpPower);
}
public void dismantle(){
  scissorSRX.set(ScissorLiftConstants.scissorLiftDownPower);
}

}
