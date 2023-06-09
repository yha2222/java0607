package ddit.chap04.sec04;

import java.util.Scanner;

public class WhileStatementExample01 {

	public static void main(String[] args) {
		// while ����
		
		//gugudan();
		//moneyBox();
		//numberChop();
		cafe();
		
		//���� 2. ��� ������ �������� 10�� �������ؾ� �Ѿ�ٰ� �Ѵ�.
		//      �� ������ while������ ���� �� ǥ��.
		//     ��) "�������� 1��° �������� �߽��ϴ�. ���� ������ �� �Ѿ� �����ϴ�."
		//		  "�������� 10��° �������� �߽��ϴ�. ������ �Ѿ���ϴ�."
		

	}

	//���� 1. ������ while������ ���
	public static void gugudan() {
		int dan = 2;
		//�ٱ��� ����� ����
		while(dan > 1 && dan < 10) {
			//���� ������ �ݺ� ���� => �ʱⰪ, ���ǹ�, ������ - for���� �ٸ��� ���� ���
			System.out.println("\n" + dan + "��");
			int amt = 1;
			//���� ����� ����
			while(amt < 10) {
				System.out.println(dan + "*" + amt + "=" + (dan * amt));
				amt++;  //�������� ���� ����� �ؼ� ���ѷ��� ����
			}
			dan++;
		}
	}
	
	//���� 3. ù ���� 100��, �״��������� ������ 2�辿 ������ �� ���ʷ� 100���� �Ѵ� �� ����
	//      �׶����� ������ �ݾ��� ����Ͻÿ�.
	public static void moneyBox() {
		int sum = 0;   //���� �Ѿ� - 100���� ������ ��
		int days = 0;  //����ϼ�
		int amount = 100;
		
		while(sum <= 1000000) {
			sum = sum + amount;   //�Ϸ� ���
			amount = amount * 2;
			days++;
		}
		System.out.println("����ϼ� : " + days);
		System.out.println("����ݾ�: " + sum);
	}
	
	//���� 2. ��� ������ �������� 10�� �������ؾ� �Ѿ�ٰ� �Ѵ�.
	//      �� ������ while������ ���� �� ǥ��.
	//     ��) "�������� 1��° �������� �߽��ϴ�. ���� ������ �� �Ѿ� �����ϴ�."
	//		  "�������� 10��° �������� �߽��ϴ�. ������ �Ѿ���ϴ�."
	public static void numberChop() {
		int count = 0;
		while(count < 9) {
			count++;
			System.out.println(count + "��° �������� �߽��ϴ�. ���� ������ �� �Ѿ� �����ϴ�.");	
		}
		System.out.println("--------------------------");
		System.out.println(++count + "��° �������� �߽��ϴ�. ������ �Ѿ���ϴ�.");
	}
	
	//���� 4. �ٸ��� ��� ī���� Ŀ�� ������ �����̴�.
	//      ���� �ֹ��ϴ� Ŀ�ǿ� ���� �ݾ��� ����ϴ� ������ �����
	//      1. �Ƹ޸�ī��	   2000��
	// 		2. ī��� 	   3500��
	//		3. ī��Ḷ���߶�      5000��
	// 		4. �ڹ�Ĩ ����Ǫġ��  6500��
	// 		5. ����
	public static void cafe() {
		//�޴� ��¿�
		String menu = "1. �Ƹ޸�ī��    	  2000��\n" + 
					  "2. ī��� 		  3500��\n" + 
					  "3. ī��Ḷ���߶�	  5000��\n" + 
					  "4. �ڹ�Ĩ ����Ǫġ��  6500��\n" + 
					  "5. ����\n";
		
		int sum = 0;  //�ֹ��ݾ� �հ�
		int exit = 0; //���α׷� ���� ���� ǥ����
		String bill = "	  *** ������ ***\n";
		bill += "-------------------------------\n";
		
		while(true) {  //while�� �� ���� ���ѹݺ�	=> Ż�� �ʿ� => break;
			System.out.println(menu);  //�޴� ���
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Ŀ�� ����: ");  //!����! �Է� ����
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				sum = sum + 2000;
				bill += "1. �Ƹ޸�ī��		2000��\n";
				break;
			case 2:
				sum = sum + 3500;
				bill += "2. ī��� 		3500��\n";
				break;
			case 3:
				sum = sum + 5000;
				bill += "3. ī��Ḷ���߶�		5000��\n";
				break;
			case 4:
				sum = sum + 6500;
				bill += "4. �ڹ�Ĩ ����Ǫġ��		6500��\n";
				break;
			case 5:
				exit = -1;
				break;   //switch�� ������ => if(exit == -1)
			default :
				System.out.println("�߸��� �����Դϴ�.");
			}
			if(exit == -1) {
				System.out.println("���α׷� ����");
				break;    //while�� ������
			}
		}
		bill += "-------------------------------\n";
		bill += "     �հ�: " + sum;
		System.out.println(bill);
	}
}
