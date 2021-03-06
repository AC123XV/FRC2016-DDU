package org.firstinspires.frc._4739.phases;

import org.firstinspires.frc._4739.HW;
import org.firstinspires.frc.framework.software.MatchPhaseRoutine;

/**
 * 4739's disabled routine for the 2016 game (FIRST Stronghold).
 * @author FRC 4739 Thunderbolts Robotics
 * @version 2016-07-09/00
 */
@SuppressWarnings("unused")
public class Disabled extends MatchPhaseRoutine {
	public void start() {
		HW.Drive.stop();
		HW.Shooter.stop();
	}

	public void loop() {
		start();
	}
}
