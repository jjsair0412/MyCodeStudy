package Interface_pratice;

public class ToyImplements implements ToyCon{
	
	@Override
	public void run() {
		System.out.println("비행기가 run");
	}
	
	@Override
	public void walk() {
		System.out.println("비행기가 walk");
	}
	
	@Override
	public void stop() {
		System.out.println("비행기가 stop");
	}
	
	@Override
	public void alarm() {
		System.out.println("비행기가 alarm");
	}
}
