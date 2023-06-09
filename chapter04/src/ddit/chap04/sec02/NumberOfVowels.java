package ddit.chap04.sec02;

import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;   //모음 수  => 지역변수 => 반드시 초기화 시켜야 됨
						 //a,e,i,o,u
		
		System.out.print("단어 입력: ");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' ||
					ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("단어 + " + word + "에 포함된 모음 수는 " + count + "이다.");
	}

}
