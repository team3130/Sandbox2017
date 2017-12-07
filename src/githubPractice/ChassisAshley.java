/*
public class ChassisAshley{

	private static RobotDrive mdrive;
	private static CANTalon m_leftMotorFront;
	private static CANTalon m_leftMotorRear;
	private static CANTalon m_rightMotorFront;
	private static CANTalon m_rightMotorRear;
	
	private ChassisAshley(){
		m_leftMotorFront = new CANTalon(0);
		m_leftMotorRear = new CANTalon(1);
		m_rightMotorFront = new CANTalon(2);
		m_rightMotorRear = new CANTalon(3);
		
		m_drive = new RobotDrive(m_leftMotorFront, m_rightMotorFront);
	}
	
	//command that is run when the subsystem is created
	public void initDefaultCommand(){
		
	}
	
	public static void DriveTank(double moveL, double moveR){
		m_drive.tankDrive(moveL, moveR, false);
	}
	
	public static void DriveArcade(double moveL, double moveR){
		m_drive.arcadeDrive(moveL, moveR, false);
	}
}
*/