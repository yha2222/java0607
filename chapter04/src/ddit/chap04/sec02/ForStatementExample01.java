package ddit.chap04.sec02;

public class ForStatementExample01 {  //public class �� �ϳ�!

	public static void main(String[] args) {
		//for�� ����
		//���� 1. 1-100 ������ ������ ��� ����Ͻÿ�.
		//���� 2. 1-100 ������ ��� ���� ���� ���� ����Ͻÿ�.
		//���� 3. 1-100 ���̿� �����ϴ� ¦���� Ȧ���� ���� ����Ͻÿ�.

		ForStatement fs = new ForStatement();  
		fs.forMethod02();
		//Ŭ������ ��ü�� ����ϴ� ��� => ���� reuse
		//() ������ ������ method, new => �迭, Ŭ�������� ���� => heap memory
	}

}

class ForStatement {					          //�Ϲ� Ŭ����
	public void forMethod01() {
		for(int i = 1; i < 101; i++) {
			System.out.print(i + " ");            //i => �ݺ� ���� => ���� ����
		}
		
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("\n��= " + sum);		  //i => �ݺ� ���� => ���� ����
		
		int odd = 0; 							  //Ȧ�� ��
		int even = 0; 							  //¦�� ��
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.println("¦���� ��: " + even);
		System.out.println("Ȧ���� ��: " + odd);
		System.out.println("��ü ��: " + (even+odd));
	}
	
	public void forMethod02() {
		int y = 2023;
		int month = 6;
		int d = 8;
		int days = 0;  //��ü ��� �ϼ�
		for(int year = 1; year < y; year++) {     //2023�� ���� �� ���������ϱ� ���� X
			//���� ��� ����
			if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
				//���� : 366��
				days += 366;
			}else {
				days += 365;
			}
		}
		for(int m = 1; m < month; m++) {		  //6���� ���� �� ���������ϱ� ���� X
			switch(m) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days = days + 31;
				break;
			case 4: case 6: case 9: case 11:
				days = days + 30;
				break;
			case 2:
				if((y%4 == 0 && y%100 != 0) || (y%400 == 0)) {
					days = days + 29;
				}else {
					days = days + 28;
				}
			}
		}
		days = days + d;  //���� �� + 6�� ����� �ϼ�
		System.out.println("���� 1�� 1�� 1�Ϻ��� ���ñ��� ����� �ϼ��� " + days +"�� �Դϴ�.");
		switch(days%7) {
		case 0 :
			System.out.println("�Ͽ����Դϴ�.");
			break;
		case 1 :
			System.out.println("�������Դϴ�.");
			break;
		case 2 :
			System.out.println("ȭ�����Դϴ�.");
			break;
		case 3 :
			System.out.println("�������Դϴ�.");
			break;
		case 4 :
			System.out.println("������Դϴ�.");
			break;
		case 5 :
			System.out.println("�ݿ����Դϴ�.");
			break;
		case 6 :
			System.out.println("������Դϴ�.");
			break;
		case 7 :
			System.out.println("�Ͽ����Դϴ�.");
			break;
		}
	}
}