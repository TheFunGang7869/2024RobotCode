
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import java.util.function.DoubleSupplier;
import frc.robot.subsystems.DriveTrain;

public class TankDrive extends Command {

    private final DriveTrain m_driveTrain;
    private DoubleSupplier m_left;
    private DoubleSupplier m_right;

    public TankDrive(DoubleSupplier left, DoubleSupplier right, DriveTrain subsystem) {

        m_left = left;
        m_right = right;

        m_driveTrain = subsystem;
        addRequirements(m_driveTrain);

    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {

        m_driveTrain.drive(Math.pow(-1 * m_left.getAsDouble(), 1.5), Math.pow(-1 * m_right.getAsDouble(), 1.5));
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        m_driveTrain.drive(0.0, 0.0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;

    }
}
