// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.*;

import frc.robot.subsystems.*;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // Define robot subsystems
  private final Intake intake = new Intake();
  private final GroundIntake groundIntake = new GroundIntake(); //Here's my new ground intake code!
  private final Shooter shooter = new Shooter();
  private final Winch winch = new Winch();
  private final ScissorLift scissorLift = new ScissorLift();
  public final DriveTrain driveTrain = new DriveTrain();

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
    new JoystickButton(joystick, 2).whileTrue(new IntakeCommand(intake));
    new JoystickButton(joystick, 3).whileTrue(new GroundIntakeCommand(groundIntake)); // Here's my attempt at a
    new JoystickButton(joystick, 6).whileTrue(new WinchCommand(winch));              // Ground Intake command!
    new JoystickButton(joystick, 7).whileTrue(new WinchRetractCommand(winch));
    new JoystickButton(joystick, 11).whileTrue(new ScissorLiftCommand(scissorLift, true));  // True = Up!
    new JoystickButton(joystick, 10).whileTrue(new ScissorLiftCommand(scissorLift, false)); // False = Down!
  }

  // I went ahead and tried to rebind controls in a way that leaves less room for error, the intake buttons
  // being right next to the winch commands doesn't seem like too good of an idea.. -joel :3c

  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    //return Autos.exampleAuto(m_exampleSubsystem);
    return new AutoDriveForward(driveTrain);
    
  }
}
