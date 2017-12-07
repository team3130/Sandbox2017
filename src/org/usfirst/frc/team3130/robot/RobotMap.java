package org.usfirst.frc.team3130.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Motors-CAN
	public static final int CAN_PNMMODULE = 1;
	public static final int CAN_RIGHTMOTORFRONT = 2;
	public static final int CAN_LEFTMOTORFRONT = 3; 
    public static final int CAN_RIGHTMOTORREAR = 4;
    public static final int CAN_LEFTMOTORREAR = 5;
	public static final int CAN_TURRETHOPL = 8; 
	public static final int CAN_TURRETHOPR = 9; 
	public static final int CAN_GEARBAR = 12;
	public static final int CAN_TURRETANGLE = 13;
	public static final int CAN_TURRETINDEX = 14;
	public static final int CAN_SHOOTERMASTER = 16; 
	public static final int CAN_SHOOTERSLAVE = 15; 
	
	//Pnuematics Ports
	public static final int PNM_GEARSHIFTER = 0;
	public static final int PNM_GEARLIFT = 4;
	public static final int PNM_GEARPINCH = 2;
	
	//Buttons and Axes
	
		//Button List
		public static final int LST_BTN_A = 1;
		public static final int LST_BTN_B = 2;
		public static final int LST_BTN_X = 3;
		public static final int LST_BTN_Y = 4;
		public static final int LST_BTN_LBUMPER = 5;
		public static final int LST_BTN_RBUMPER = 6;
		public static final int LST_BTN_BACK = 7;
		public static final int LST_BTN_START = 8;
		public static final int LST_BTN_RJOYSTICKPRESS = 9;
		public static final int LST_BTN_LJOYSTICKPRESS = 10;

		//Axis List
		public static final int LST_AXS_LJOYSTICKX = 0;
		public static final int LST_AXS_LJOYSTICKY = 1;
		public static final int LST_AXS_LTRIGGER = 2;
		public static final int LST_AXS_RTRIGGER = 3;
		public static final int LST_AXS_RJOYSTICKX = 4;
		public static final int LST_AXS_RJOYSTICKY = 5;

		//POV Degress List
		public static final int LST_POV_UNPRESSED = -1;
		public static final int LST_POV_N = 0;
		public static final int LST_POV_NE = 45;
		public static final int LST_POV_E = 90;
		public static final int LST_POV_SE = 135;
		public static final int LST_POV_S = 180;
		public static final int LST_POV_SW = 225;
		public static final int LST_POV_W = 270;
		public static final int LST_POV_NW = 315;
	
		//put your own button names by assigning them to one of the above here
}
