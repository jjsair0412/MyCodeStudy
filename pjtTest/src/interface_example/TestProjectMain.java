package interface_example;

public class TestProjectMain {

	public static void main(String[] args) {
		Duck wildDuck1 = new WildDuck();
		
		Robot robotAnimal1 = new RobotDuck();
		
		wildDuck1.swimming();
		
		robotAnimal1.calculation();
		
		RobotDuck robotDuck1 = new RobotDuck();
		
		robotDuck1.swimming();
		robotDuck1.calculation();
		
		System.out.println("\n");
		
		HouseDuck houseDuck1 = new HouseDuck();
		
		Slaughterhouses sh = new Slaughterhouses();
		
		sh.slaughter(wildDuck1);
		sh.slaughter(houseDuck1);
		sh.slaughter(robotDuck1);
	}

}
