package ddit.chap04.sec01;

import java.util.Scanner;

public class report01 {

	public static void main(String[] args) {
		//��ǻ�Ϳ� ���������� �������ϴ� ���α׷��� �ۼ��Ͻÿ�..
		//  1. ��ǻ�ʹ� 1-3������ ������ �߻���Ų��.
		//  2. ����=>1, ����=>2, ��=>3�̸� 
		//  3. ����ڴ� Ű����ȣ 1-3������ ���ڸ� �Է��Ͽ� 
		//      ���ڸ� �����Ѵ�

		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*3)+1;
		
		System.out.print("���� �Է�(1~3): ");
	
		
		while(true) {
		int user = sc.nextInt();
			
		if((user == 1 && com == 3) || 
		   (user == 2 && com == 1) || 
		   (user == 3 && com == 2)) {
			System.out.println("�̰���ϴ�.");
			break;
		}else if(user == com) {
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
		}
	}

}
