package ddit.chap04.sec01;

import java.util.Scanner;

public class report01 {

	public static void main(String[] args) {
		//컴퓨터와 가위바위보 게임을하는 프로그램을 작성하시오..
		//  1. 컴퓨터는 1-3사이의 난수를 발생시킨다.
		//  2. 가위=>1, 바위=>2, 보=>3이며 
		//  3. 사용자는 키보드호 1-3사이의 숫자를 입력하여 
		//      승자를 결정한다

		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*3)+1;
		
		System.out.print("숫자 입력(1~3): ");
	
		
		while(true) {
		int user = sc.nextInt();
			
		if((user == 1 && com == 3) || 
		   (user == 2 && com == 1) || 
		   (user == 3 && com == 2)) {
			System.out.println("이겼습니다.");
			break;
		}else if(user == com) {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		}
	}

}
