package Interface_pratice;

public class MainClass {
	public static void main(String[] args) {
		ToyCon aToy = new ToyImplements();
		ToyCon pToy = new PersonToy();
		
		
		// ToyCon interface의 데이터타입의 배열인 toy[]를 생성해서, aToy와 pToy를 넣어줌
		// 객체는 서로 다르지만, aToy와 pToy의 데이터타입은 ToyCon으로 동일하기 때문에
		// 배열에 정상적으로 들어간다.
		ToyCon toy[] = {aToy, pToy};
		
		for(int i = 0; i<=toy.length-1; i++) {
			toy[i].walk();
			toy[i].stop();
			toy[i].run();
			toy[i].alarm();
			
			System.out.println();
		}
		
	}
}
