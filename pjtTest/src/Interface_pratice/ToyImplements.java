package Interface_pratice;

public class ToyImplements implements ToyCon{
	
	@Override
	public void run() {
		System.out.println("����Ⱑ run");
	}
	
	@Override
	public void walk() {
		System.out.println("����Ⱑ walk");
	}
	
	@Override
	public void stop() {
		System.out.println("����Ⱑ stop");
	}
	
	@Override
	public void alarm() {
		System.out.println("����Ⱑ alarm");
	}
}
