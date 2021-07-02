package Inner_class_and_anonymous_class_base_study;


public class MainClass_InnerClass {
	
	public static void main(String[] args) {
		OuterClass outclass = new OuterClass();
		System.out.println("OuterClass의 num : "+ outclass.num);
		System.out.println("OuterClass의 str1 : "+ outclass.str1);
		
		System.out.println();
		
		// 내부클래스 객체 생성방법
		OuterClass.InnerClass In = outclass.new InnerClass();
		System.out.println("InnerClass의 num : "+ In.num);
		System.out.println("InnerClass의 str1 : "+ In.str1);
		
		System.out.println();
		
		//Static InnerClass 객체 생성
		OuterClass.SInnerClass sIn = new OuterClass.SInnerClass();
		System.out.println("Static InnerClass의 num : "+ sIn.num);
		System.out.println("Static InnerClass의 str3 : "+ sIn.str3);
		
		System.out.println();
		
		// 이름이 없는 클래스이기때문에, 익명 클래스이다.( AnonymousClass )생성된 객체를 재사용할수 없다.
		// 익명클래스 내부에, 재정의가 필요한 메서드를 하나 작성해서 한번 메서드를 재정의할 수 있다.
		// 익명클래스는 인터페이스나, 추상클래스에 사용되는 프로그래밍 방식이다.
		
		new AnonymousClass() {
			
			@Override
			public void Jinmethod() {
				System.out.println("Main에 Anonymous method START");
			}
			
		}.Jinmethod();
		
	}
}
