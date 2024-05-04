// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project. 
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.GroundIntakeConstants;

public class GroundIntake extends SubsystemBase {

private CANSparkMax groundIntakeSRX;

  public GroundIntake() {
   // groundIntakeSRX = new CANSparkMax(GroundIntakeConstants.groundIntakeMotorID, MotorType.kBrushed); //
    
    
//I'm not sure whether or not it's brushed or not...
    groundIntakeSRX.burnFlash();
      }
  
  public void deactivate(){
    groundIntakeSRX.set(0.0);
  }

  public void succ(){
    groundIntakeSRX.set(GroundIntakeConstants.succingPower);
  }

  public void spit(){
    groundIntakeSRX.set(GroundIntakeConstants.spittingPower);
  }



}

// JOEL: This is me trying to make a ground intake subsystem based on the intake subsystem!
// I have no clue whether or not this is even necessary, so let me know how much this rocks or sucks! :3c