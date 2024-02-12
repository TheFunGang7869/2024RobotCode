// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Timer;

/** An example command that uses an example subsystem. */
public class ShootCommand extends Command {
  private final Shooter shooter;

  private final Timer timer = new Timer();

  public ShootCommand(Shooter containerShooter) {
    shooter = containerShooter;
    addRequirements(shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    shooter.turnoff();
    timer.restart();
    shooter.dash();
    while (timer.get() <= 1){

    }
    shooter.followerDash();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //shooter.turnoff();
    shooter.moonwalk();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
