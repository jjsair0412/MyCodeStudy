package Interface_pratice;

public class PersonToy implements ToyCon{

	@Override
	public void run() {
		System.out.println("����� run");
	}

	@Override
	public void walk() {
		System.out.println("����� walk");
	}

	@Override
	public void stop() {
		System.out.println("����� stop");
	}

	@Override
	public void alarm() {
		System.out.println("����� alarm");
	}

	
}
