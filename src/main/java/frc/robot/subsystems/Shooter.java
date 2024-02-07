// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class Shooter extends SubsystemBase {

  private WPI_VictorSPX shooterSPX;
  private WPI_VictorSPX shooterFollowerSPX;

  public Shooter() {

    shooterSPX = new WPI_VictorSPX(ShooterConstants.shooterMotorID);
    shooterFollowerSPX = new WPI_VictorSPX(ShooterConstants.shooterFollowerMotorID);
    shooterFollowerSPX.follow(shooterSPX);
  }

  public void turnoff() {
    shooterSPX.set(0.0);
  }

  public void dash() {
    shooterSPX.set(ShooterConstants.shooterDash);
  }

  public void moonwalk() {
    shooterSPX.set(ShooterConstants.shooterMoonwalk);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */

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
