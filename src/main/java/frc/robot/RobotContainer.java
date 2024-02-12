// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.*;

import frc.robot.subsystems.*;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // Define robot subsystems
  private final Intake intake = new Intake();
  private final Shooter shooter = new Shooter();
  private final Winch winch = new Winch();
  private final ScissorLift scissorLift = new ScissorLift();
  private final DriveTrain driveTrain = new DriveTrain();

  // Define controllers
  private final Joystick joystick = new Joystick(0);
  private final XboxController xboxController = new XboxController(1);

  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();

    // Configure tank drive bindings  
    driveTrain.setDefaultCommand(new TankDrive(() -> xboxController.getLeftY(),
     () -> xboxController.getRightX(), driveTrain));
  }

  // Set all commands to joystick buttons
  private void configureBindings() {
   new JoystickButton(joystick, 1).whileTrue(new ShootCommand(shooter));
   new JoystickButton(joystick, 3).whileTrue(new IntakeCommand(intake));
    new JoystickButton(joystick, 2).whileTrue(new WinchCommand(winch));
    new JoystickButton(joystick, 4).whileTrue(new ScissorLiftCommand(scissorLift, true));//True means go up!
    new JoystickButton(joystick, 5).whileTrue(new ScissorLiftCommand(scissorLift, false));//False means go down!
  
  }
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    //return Autos.exampleAuto(m_exampleSubsystem);
    //return new AutonomousCommand(driveTrain);
    return null;
  }
}
