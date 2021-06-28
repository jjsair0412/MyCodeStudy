package pjtTest;

public class MainClass {
	public static void main(String[] args) { 
		int i = 10;
		int j;
		j = 100;
		
		
		i = 200; // 다시 초기화되어 i에는 200이 저장됨.
		System.out.println("i + j = "+(i+j)); // 300 출력.
		
	}
}
