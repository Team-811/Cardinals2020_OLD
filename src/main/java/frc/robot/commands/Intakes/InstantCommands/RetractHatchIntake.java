/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Intakes.InstantCommands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * This is a command.  A command is used to make actual actions happen on the robot.  It can be a single action or a sequence of actions.
 */
public class RetractHatchIntake extends InstantCommand {
  /**
   * Add your docs here.
   */
  public RetractHatchIntake() {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.intakes);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.intakes.retractHatchIntake();
  }

}
