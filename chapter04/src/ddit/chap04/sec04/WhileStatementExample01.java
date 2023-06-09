package ddit.chap04.sec04;

import java.util.Scanner;

public class WhileStatementExample01 {

	public static void main(String[] args) {
		// while 예제
		
		//gugudan();
		//moneyBox();
		//numberChop();
		cafe();
		
		//예제 2. 어느 나무는 나무꾼이 10번 도끼질해야 넘어간다고 한다.
		//      이 과정을 while문으로 구성 해 표현.
		//     예) "나무꾼이 1번째 도끼질을 했습니다. 아직 나무는 안 넘어 갔습니다."
		//		  "나무꾼이 10번째 도끼질을 했습니다. 나무가 넘어갔습니다."
		

	}

	//예제 1. 구구단 while문으로 출력
	public static void gugudan() {
		int dan = 2;
		//바깥쪽 제어변수 설정
		while(dan > 1 && dan < 10) {
			//조건 맞으면 반복 수행 => 초기값, 조건문, 증감문 - for문과 다르게 별도 기술
			System.out.println("\n" + dan + "단");
			int amt = 1;
			//안쪽 제어변수 설정
			while(amt < 10) {
				System.out.println(dan + "*" + amt + "=" + (dan * amt));
				amt++;  //언젠가는 조건 벗어나게 해서 무한루프 방지
			}
			dan++;
		}
	}
	
	//예제 3. 첫 날에 100원, 그다음날부터 전날의 2배씩 저축할 떄 최초로 100만원 넘는 날 수와
	//      그때까지 저축한 금액을 계산하시오.
	public static void moneyBox() {
		int sum = 0;   //저금 총액 - 100만원 넘으면 끝
		int days = 0;  //경과일수
		int amount = 100;
		
		while(sum <= 1000000) {
			sum = sum + amount;   //하루 경과
			amount = amount * 2;
			days++;
		}
		System.out.println("경과일수 : " + days);
		System.out.println("저축금액: " + sum);
	}
	
	//예제 2. 어느 나무는 나무꾼이 10번 도끼질해야 넘어간다고 한다.
	//      이 과정을 while문으로 구성 해 표현.
	//     예) "나무꾼이 1번째 도끼질을 했습니다. 아직 나무는 안 넘어 갔습니다."
	//		  "나무꾼이 10번째 도끼질을 했습니다. 나무가 넘어갔습니다."
	public static void numberChop() {
		int count = 0;
		while(count < 9) {
			count++;
			System.out.println(count + "번째 도끼질을 했습니다. 아직 나무는 안 넘어 갔습니다.");	
		}
		System.out.println("--------------------------");
		System.out.println(++count + "번째 도끼질을 했습니다. 나무가 넘어갔습니다.");
	}
	
	//예제 4. 다름은 어느 카페의 커피 종류와 가격이다.
	//      고객이 주문하는 커피와 현재 금액을 출력하는 영수증 만들기
	//      1. 아메리카노	   2000원
	// 		2. 카페라떼 	   3500원
	//		3. 카라멜마끼야또      5000원
	// 		4. 자바칩 프라푸치노  6500원
	// 		5. 종료
	public static void cafe() {
		//메뉴 출력용
		String menu = "1. 아메리카노    	  2000원\n" + 
					  "2. 카페라떼 		  3500원\n" + 
					  "3. 카라멜마끼야또	  5000원\n" + 
					  "4. 자바칩 프라푸치노  6500원\n" + 
					  "5. 종료\n";
		
		int sum = 0;  //주문금액 합계
		int exit = 0; //프로그램 종료 상태 표현값
		String bill = "	  *** 영수증 ***\n";
		bill += "-------------------------------\n";
		
		while(true) {  //while문 평가 없이 무한반복	=> 탈출 필요 => break;
			System.out.println(menu);  //메뉴 출력
			Scanner sc = new Scanner(System.in);
			
			System.out.print("커피 선택: ");  //!숫자! 입력 받음
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				sum = sum + 2000;
				bill += "1. 아메리카노		2000원\n";
				break;
			case 2:
				sum = sum + 3500;
				bill += "2. 카페라떼 		3500원\n";
				break;
			case 3:
				sum = sum + 5000;
				bill += "3. 카라멜마끼야또		5000원\n";
				break;
			case 4:
				sum = sum + 6500;
				bill += "4. 자바칩 프라푸치노		6500원\n";
				break;
			case 5:
				exit = -1;
				break;   //switch문 나가기 => if(exit == -1)
			default :
				System.out.println("잘못된 선택입니다.");
			}
			if(exit == -1) {
				System.out.println("프로그램 종료");
				break;    //while문 나가기
			}
		}
		bill += "-------------------------------\n";
		bill += "     합계: " + sum;
		System.out.println(bill);
	}
}
