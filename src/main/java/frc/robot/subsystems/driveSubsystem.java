// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.subsystems.driveSubsystem;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class driveSubsystem extends SubsystemBase 
{
  Victor leftBack = new Victor(Constants.leftBack);
  Victor rightBack = new Victor(Constants.rightBack);
  Victor leftFront = new Victor(Constants.leftFront);
  Victor rightFront = new Victor(Constants.rightFront);
  
  SpeedControllerGroup leftMotorSide = new SpeedControllerGroup(leftFront, leftBack);
  SpeedControllerGroup rightMotorSide = new SpeedControllerGroup(rightFront, rightBack);

  DifferentialDrive drive = new DifferentialDrive (leftMotorSide,rightMotorSide);

  

  public void driveMethod(double leftSpeed, double rightSpeed)
  {
    drive.tankDrive(leftSpeed, rightSpeed);

  }



  /** Creates a new Drive. */
  public driveSubsystem() 
  {

  }

  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
  }


}
