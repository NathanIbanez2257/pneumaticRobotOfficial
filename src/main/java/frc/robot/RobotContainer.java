// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.driveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.commands.rightShooterCommand;
import frc.robot.commands.leftShooterCommand;
import frc.robot.commands.spiderCommand;




public class RobotContainer 
{

  Joystick nathanController = new Joystick(Constants.nathanController);
  
  private final driveSubsystem driveSubsystem = new driveSubsystem();

    private Joystick nathanJoystick;
    private JoystickButton leftShoot, rightShoot, spiderShoot;


  public RobotContainer() 
  {
    configureButtonBindings();


    driveSubsystem.setDefaultCommand (new RunCommand(
     () -> driveSubsystem.driveMethod(Constants.driveSpeed * nathanController.getRawAxis(Constants.leftJoystick),
     Constants.driveSpeed * nathanController.getRawAxis(Constants.rightJoystick)),
     driveSubsystem));


  }

  private void configureButtonBindings() 
  {
    

        nathanJoystick = new Joystick(0);
        leftShoot = new JoystickButton(nathanJoystick, 2);
        rightShoot = new JoystickButton(nathanJoystick, 3);
        spiderShoot = new JoystickButton(nathanJoystick, 4);

        leftShoot.whenHeld(new leftShooterCommand());
        rightShoot.whenHeld(new rightShooterCommand());
        spiderShoot.whenHeld(new spiderCommand());

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
