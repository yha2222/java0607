package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExample01 {

	public static void main(String[] args) {
		ifStatement is = new ifStatement();
		//is.method1();
		is.method2();

	}

}

class ifStatement{
	//��1)Ű����� ���� �Է� �޾� 60�� �̻��̸� "�հ�" ���
	Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		if(score >= 60) {
			System.out.println("�հ�");
		}
	}
	
	public void method2() {
		//��2)��ǻ�� -> 1~50�� ���� �߻�, ����� -> 1~50�� ���� �Է¹޾� ��ǻ���� ���� ���߱�
		//    ����� �Է� �� < ��ǻ�� �� ���� => "�� ū ���� �Է��ϼ���" ���
        //	    ����� �Է� �� > ��ǻ�� �� ���� => "�� ���� ���� �Է��ϼ���" ���
        //	    ����� �Է� �� = ��ǻ�� �� ���� => "�����Դϴ�" + �õ�Ƚ�� ���
		// ��ǻ�� ��, ����� ��, �õ�Ƚ��(+=1)
		
		int com = (int)(Math.random()*50)+1;    //��ǻ�� �� ����
		int count = 0; 							//�õ�Ƚ��
		
		while(true) {							//��� �õ����� �𸣴ϱ� one roof
			System.out.print("���� �Է�(1~50) : ");
			int user = sc.nextInt();
			count++;
			
			if(com > user) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(com < user) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ�Ƚ��: " + count);
				break;
			}
		}
	}
}