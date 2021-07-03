package interface_example;

public class Slaughterhouses {
	public void slaughter(Duck duck) {
		
		if (duck instanceof Robot) {
			System.out.println("can`t slaughter because "+ duck.getClass().getName());
		}else {
			System.out.println("slaughter "+ duck.getClass().getName());
		}
	}
}
