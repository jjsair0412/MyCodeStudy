package interface_example;

public class RobotDuck implements Duck, Robot {

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("Swimming by gear");
	}

	@Override
	public void calculation() {
		// TODO Auto-generated method stub
		System.out.println("Calculating");
	}

}
