// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.WinchConstants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;

public class Winch extends SubsystemBase {
  // DECLARE MOTOR
  private CANSparkMax winchSparkMax;
  private CANSparkMax winchFollowerSparkMax;
  private RelativeEncoder winchEncoder;

   public Winch() {
     // Instantiate MOTOR
     winchFollowerSparkMax = new CANSparkMax(WinchConstants.winchMotorFollowID, MotorType.kBrushless);
     winchSparkMax = new CANSparkMax(WinchConstants.winchMotorID, MotorType.kBrushless);
     winchFollowerSparkMax.follow(winchSparkMax);

    winchSparkMax.setInverted(true);
    winchFollowerSparkMax.setInverted(true);

    winchEncoder = winchSparkMax.getEncoder();

  }

     winchSparkMax.setIdleMode(IdleMode.kBrake);
     winchFollowerSparkMax.setIdleMode(IdleMode.kBrake);
   }

   public void awaken() {
     winchSparkMax.set(WinchConstants.winchLiftPower);
   }

   public void retract() {
     winchSparkMax.set(WinchConstants.winchRetractPower);
   }

   public void slumber() {
     winchSparkMax.set(0.0);
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

  public void resetEncoder() {
    winchEncoder.setPosition(0.0);
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Winch Position", winchEncoder.getPosition());
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
