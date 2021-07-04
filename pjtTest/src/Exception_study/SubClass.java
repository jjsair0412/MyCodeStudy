package Exception_study;

public class SubClass {
	// throws는, 예외가 발생하면 나(지금 위치한 메서드)를 호출한 곳으로 예외를 보내버린다.
		public void firstMethod() throws Exception{ 
			secondMethod();
		}
		
		public void secondMethod() throws Exception{
			thirdMethod();
		}
		
		public void thirdMethod() throws Exception{
			System.out.println("10 / 0 : "+(10/0));
		}
}
