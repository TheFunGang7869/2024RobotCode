// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.Constants.ScissorLiftConstants;

public class ScissorLift extends SubsystemBase {

private WPI_VictorSPX scissorSPX;
  public ScissorLift() {

    scissorSPX = new WPI_VictorSPX(ScissorLiftConstants.scissorLiftMotorID);

  }
public void turnoff(){
  scissorSPX.set(0.0);
}
public void cleave(){
  scissorSPX.set(ScissorLiftConstants.scissorLiftUpPower);
}
public void dismantle(){
  scissorSPX.set(ScissorLiftConstants.scissorLiftDownPower);
}

}
