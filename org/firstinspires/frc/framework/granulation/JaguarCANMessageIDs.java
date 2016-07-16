package org.firstinspires.frc.framework.granulation;

/**
 * @author FRC 4739 Thunderbolts Robotics
 * @version 2016-07-16/00
 */
enum JaguarCANMessageIDs {
	set_Percent(33685824), set_Current(33687040), set_Speed(33689088), set_Position(33690048), set_Voltage(33687936),
	setP_Current(33686720), setP_Speed(33688768), setP_Position(33689792),
	setI_Current(33686784), setI_Speed(33688832), setI_Position(33689856),
	setD_Current(33686848), setD_Speed(33688896), setD_Position(33689920);

	private final int value;

	JaguarCANMessageIDs(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}
}
