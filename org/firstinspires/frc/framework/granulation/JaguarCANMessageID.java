package org.firstinspires.frc.framework.granulation;

/**
 * @author FRC 4739 Thunderbolts Robotics
 * @version 2016-07-16/02
 */
enum JaguarCANMessageID {
	NULL(0),
	VerificationMask(536870911),
	set_Percent(33685824), set_Current(33687040), set_Speed(33689088), set_Position(33690048), set_Voltage(33687936),
	setP_Current(33686720), setP_Speed(33688768), setP_Position(33689792),
	setI_Current(33686784), setI_Speed(33688832), setI_Position(33689856),
	setD_Current(33686848), setD_Speed(33688896), setD_Position(33689920),
	enableControl_Percent(33685760), enableControl_Current(33686976), enableControl_Speed(33689024), enableControl_Position(33689984), enableControl_Voltage(33687872),
	enableControl_tooMuchData(536870848),
	setVoltageRampRate_Percent(33685696), setVoltageRampRate_Voltage(33687808),
	disableControl_Percent(33685568), disableControl_Current(33686592), disableControl_Speed(33688640), disableControl_Position(33689664), disableControl_Voltage(33687616);

	private final int value;

	JaguarCANMessageID(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}
}