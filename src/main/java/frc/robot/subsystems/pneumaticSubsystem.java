// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class pneumaticSubsystem extends SubsystemBase 
{
  /** Creates a new airSubsystem. */



  private Solenoid leftRocket, rightRocket, spiderRocket;

  public pneumaticSubsystem() 
  {
    leftRocket = new Solenoid(Constants.leftRocket);
    rightRocket = new Solenoid(Constants.rightRocket);
    spiderRocket = new Solenoid(Constants.spider);
  }

  public void leftShoot(boolean b)
  {
    leftRocket.set(b);
  }

  public void rightShoot(boolean b)
  {
    rightRocket.set(b);
  }

  public void spiderShoot(boolean b)
  {
    spiderRocket.set(b);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
