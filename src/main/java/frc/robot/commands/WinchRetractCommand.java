// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Winch;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class WinchRetractCommand extends Command {
  private final Winch winch;

  public WinchRetractCommand(Winch containerWinch) {
    winch = containerWinch;
    addRequirements(winch);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
     winch.retract();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
     winch.slumber();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
