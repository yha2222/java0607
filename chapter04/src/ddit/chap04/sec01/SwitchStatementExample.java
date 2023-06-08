package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample {
	static Scanner sc =  new Scanner(System.in);

	public static void main(String[] args) {
		// ����1.Ű����� ȸ���� ���(1-3)�� �Է¹޾� 1�̸� "VIP ȸ���Դϴ�."
		//      2�̸� "��� ȸ���Դϴ�." 3�̸� "�Ϲ� ȸ���Դϴ�." �׿ܴ� "����ڵ尡 �߸� �ԷµǾ����ϴ�."
		//new SwitchStatementExample().switchMethod1();   // static ���� �� �θ��� ���
		
		// ����1.1-12���� �Է� �޾� 1, 3, 5, 7, 8, 10, 12���̸� "31�ϱ��� �ִ� ���Դϴ�."
		//					 4, 6, 9, 11 ���̸� "30�ϱ��� �ִ� ���Դϴ�." 2���̸� "28�� Ȥ�� 29�ϱ��� �ִ� ���Դϴ�."
		//new SwitchStatementExample().switchMethod2();
		
		// ����2.��� �ű��
		new SwitchStatementExample().switchMethod3();
		
		// ����3.ȭ�鿡 "[1]. ȸ���ű� ���", "[2]. ȸ������ ����", "[3]. ȸ������ ����", "[9]. �۾�����"
		//       ����ϰ� �۾���ȣ�� �Է� �޴� ���α׷�
		

	}
	
	public void switchMethod1() {
		System.out.print("ȸ�� ��� �ڵ�: ");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1 :
			System.out.println("VIP ȸ���Դϴ�.");  //���� ������ ���� break ���� ������ ���� => break ���� �����Ű�� ���� ���
			break;
		case 2 :
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 3 :
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default :
			System.out.println("�߸��� ����ڵ��Դϴ�.");
		}
	}
	
	public void switchMethod2() {
		System.out.print("�� �Է�: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			System.out.println("31�ϱ��� �ִ� ���Դϴ�.");
			break;
		case 4:	case 6:	case 9:	case 11:
			System.out.println("30�ϱ��� �ִ� ���Դϴ�.");
			break;
		case 2:
			System.out.println("28�� Ȥ�� 29�ϱ��� �ִ� ���Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
	
	public void switchMethod3() {
		System.out.print("����: ");
		int score = sc.nextInt();
		
		String grade = "";
		switch (score/10) {
		case 10 :
			grade = "A+";
			break;
		case 9 :
			grade = "A";
			switch(score % 10) {     //10���� ���� ������ => �з�
			case 0: case 1: case 2:
				grade = grade + "-"; //A-
			    break;
			case 3: case 4: case 5:
				grade = grade + "0"; //A0
				break;
			default:
				grade = grade + "+"; //A+
			}
			break;
		case 8 :
			grade = "B";
			switch(score % 10) {     //10���� ���� ������ => �з�
			case 0: case 1: case 2:
				grade = grade + "-"; //A-
			    break;
			case 3: case 4: case 5:
				grade = grade + "0"; //A0
				break;
			default:
				grade = grade + "+"; //A+
			}
			break;
		default :
			grade = "Fail";
		}
		System.out.println("���� " + score + "�� ����� " + grade + "�Դϴ�.");
		}

}
