package ddit.chap04.sec02;

public class prac2 {

	public static void main(String[] args) {
		new prac2().p15202();

	}
	
	public void p140() {
		
		int lotto = 0;
		
		for(int i = 0; i < 7; i++) {
			lotto = 0;
			int num = (int) (Math.random() * 45) + 1;
			lotto += num;
			System.out.println(lotto);
		}
	}
	
	public void p14301() {
		int time = (int) (Math.random()*4)+8;
		System.out.println("[���� �ð�: " + time + " ��]");
		
		switch(time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�� ����");
		case 10:
			System.out.println("���� ����");
		default:
			System.out.println("�ܱ� ����");
		}
	}
	
	public void p14302() {
		char grade = 'D';
		
		switch(grade) {
		case 'A': case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B': case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}
	}
	
	public void p144() {
		String position = "��";
		
		switch(position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
		}
	}
	
	public void p15201() {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i-1) +"��: " + sum);
	}
	
	public void p15202() {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);   //0.1=float => ��Ȯ�ϰ� ǥ�� X => ���� 9��
		}
	}
	
	public void p154() {
		int i = 1;

	}

}
