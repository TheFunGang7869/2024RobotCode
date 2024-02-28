// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClawConstants;

public class Claw extends SubsystemBase {

  private WPI_VictorSPX clawSPX;

  public Claw() {

    clawSPX = new WPI_VictorSPX(ClawConstants.clawMotorID);

  }

  public void turnoff() {
    clawSPX.set(0.0);
  }

  public void intake() {
    clawSPX.set(ClawConstants.clawForwardPower);
  }

  public void shoot() {
    clawSPX.set(ClawConstants.clawBackwardPower);
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a
   * digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
