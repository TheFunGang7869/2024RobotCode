// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  // The motors on the left side of the drive.
  private WPI_VictorSPX frontLeft;
  private WPI_VictorSPX backLeft;

  // The motors on the right side of the drive.
  private WPI_VictorSPX frontRight;
  private WPI_VictorSPX backRight;
  // The robot's drive
  private DifferentialDrive differentialDrive;

  public DriveTrain() {

    frontLeft = new WPI_VictorSPX(4);
    backLeft = new WPI_VictorSPX(2);

    frontRight = new WPI_VictorSPX(3);
    backRight = new WPI_VictorSPX(5);

    backLeft.follow(frontLeft);
    backRight.follow(frontRight);

    frontLeft.setNeutralMode(NeutralMode.Brake);
    frontRight.setNeutralMode(NeutralMode.Brake);

    // TODO : which side of the robot?
    frontLeft.setInverted(true);
    backLeft.setInverted(true);



    differentialDrive = new DifferentialDrive(frontRight, frontLeft);
  }

  public void drive(double left, double right) {
    
    //SmartDashboard.putNumber("DriveLeft", left);
    //SmartDashboard.putNumber("Drive right", right);

    differentialDrive.arcadeDrive(left, right);
  }

}