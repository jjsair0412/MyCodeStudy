package Exception_study;

public class MainClass {
	public static void main(String[] args) {
		// 예외처리는 Checked Exception과 unChecked Exception이 있다.
		// Checked는 예외처리를 반드시 해야 하는 경우이다. ( 네트워크, 파일 시스템(입출력) 등 )
		// UnChecked는 개발자의 판단에 맡겨 예외 처리를 해주는 경우이다.
		// 해당 예제는 UnChecked Exception이다.
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		SubClass sb = new SubClass();
		
		System.out.println("Exception BEFORE");
		
		try {
			// 0으로 나눌 수 없기 때문에 예외발생
			sb.firstMethod();
			r = i/j;
			// r = i/j에서 에러가 발생했기 때문에, 밑에있는 출력문을 실행하지 않고
			// 해당하는 catch문으로 바로 넘어감
			// 그러나, 해당 try문 내부에서 어떠한 구문은 꼭 실행해야 한다면
			// finally키워드를 사용한다.
			System.out.println(" 예외 !! ");
		}catch(Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("Exception : "+ msg);
			
		}finally {
			System.out.println("예외발생 여부에 상관없이 언제나 실행되는 finally 내부 구문들");
		}
		
		System.out.println("Exception AFTER");
	}
	
	
	
}
