package Interface_pratice;

public class MainClass {
	public static void main(String[] args) {
		ToyCon aToy = new ToyImplements();
		ToyCon pToy = new PersonToy();
		
		
		// ToyCon interface�� ������Ÿ���� �迭�� toy[]�� �����ؼ�, aToy�� pToy�� �־���
		// ��ü�� ���� �ٸ�����, aToy�� pToy�� ������Ÿ���� ToyCon���� �����ϱ� ������
		// �迭�� ���������� ����.
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
