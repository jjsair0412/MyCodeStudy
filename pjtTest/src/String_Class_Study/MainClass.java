package String_Class_Study;

public class MainClass {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println("초기 str : "+str);
		
		str += "jinsoung";
		System.out.println("추가된 str : "+str);
		
		// 기존 String은, 데이터를 추가할때 원래 있던 hello에 jinsoung을 추가하는것이 아니라
		// str의 레퍼런스가 아예 새로은 메모리공간을 만들어서 처음부터 다시 hellojinsoung을 만드는것이다.
		// 그리고 레퍼런스가 객체를 가르키고 있지 않기 때문에 기존에 hello만있던 메모리 공간은 GC가 회수한다.
		// 따라서 속도가 조금 느리고 재활용을 하지 않는다는 단점이 존재한다
		
		System.out.println();
		
		StringBuffer sf = new StringBuffer("java");
		System.out.println("초기 StringBuffer : "+sf);
		sf.append(" hello");
		System.out.println("추가된 StringBuffer : "+ sf);
		
		// 그래서 String클래스의 단점을 보완한 StringBuffer, StringBuilder가 있다.
		// StringBuffer와 StringBuilder는 기존에 있던 메모리 공간을 재활용해서, 뒤에 추가해서 사용한다.
		// 데이터 안정성은 StringBuffer가 더 좋고, 속도는 StringBuilder가 좀더 빠르다.
		
		
		// 굉장히 많은 데이터가 계속 바뀐다거나 한다면, StringBuilder나 StringBuffer를 활용하자..
	}
}
