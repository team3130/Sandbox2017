import edu.wpi.first.wpilibj.*;

public class TestChassis {
	private RobotDrive robotDrive;
	
	TestChassis()
	{
		robotDrive = new RobotDrive(1, 2);
	}

	void drive(double leftValue, double rightValue)
	{
		robotDrive.tankDrive(leftValue, rightValue);
	}
}
