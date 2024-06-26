// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class WinchConstants {
    public static final int winchMotorID = 10;
    public static final double winchLiftPower = 0.2;
    public static final double winchRetractPower = -0.4;
    public static final int winchMotorFollowID = 11;
  }

  public static class ShooterConstants {
    public static final int shooterMotorID = 1;
    public static final int shooterFollowerMotorID = 7;
    public static final double shooterDash = 1.0;
    public static final double shooterFollowerDash = 1.0;
    public static final double shooterMoonwalk = -0.15;
  }

  public static class IntakeConstants {
    public static final int intakeMotorID = 8;
    public static final double intakeForwardPower = 0.3;
    public static final double intakeBackwardPower = -0.2;
  }

  public static class GroundIntakeConstants {
    public static final int groundIntakeMotorID = 7869;
    public static final double succingPower = 0.7; // Or should I call it groundItake___?
    public static final double spittingPower = 0.7; // ^
  }  

  public static class ScissorLiftConstants {
    public static final int scissorLiftMotorID = 22;// 3;
    public static final double scissorLiftUpPower = 0.7;
    public static final double scissorLiftDownPower = -0.7;
    public static final double scissorLiftMinV = 25.6;
    public static final double scissorLiftMaxV = 85.7;
  }

  public static class AutoConstants {
    public static final double autoSpeed = .5;
    public static final double autoTime = 8.0;
  }

  public static final class ClawConstants {
    public static final int clawMotorID = 21;
    public static final double clawForwardPower = 0.2;
    public static final double clawBackwardPower = -0.2;

  }

  public static final class DriveConstants {
    public static final double joystickYPower = 1.7;
    public static final double joystickXPower = 1.3;
    public static final double joystickYScale = 1.0;
    public static final double joystickXScale = 1.0;

    public static final int kLeftMotor1Port = 0;
    public static final int kLeftMotor2Port = 1;
    public static final int kRightMotor1Port = 2;
    public static final int kRightMotor2Port = 3;
  }
}
