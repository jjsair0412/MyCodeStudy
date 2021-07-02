package Interface_pratice;

public class PersonToy implements ToyCon{

	@Override
	public void run() {
		System.out.println("사람이 run");
	}

	@Override
	public void walk() {
		System.out.println("사람이 walk");
	}

	@Override
	public void stop() {
		System.out.println("사람이 stop");
	}

	@Override
	public void alarm() {
		System.out.println("사람이 alarm");
	}

	
}
