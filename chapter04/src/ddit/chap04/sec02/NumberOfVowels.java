package ddit.chap04.sec02;

import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;   //���� ��  => �������� => �ݵ�� �ʱ�ȭ ���Ѿ� ��
						 //a,e,i,o,u
		
		System.out.print("�ܾ� �Է�: ");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' ||
					ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("�ܾ� + " + word + "�� ���Ե� ���� ���� " + count + "�̴�.");
	}

}
