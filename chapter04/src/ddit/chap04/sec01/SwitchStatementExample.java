package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample {
	static Scanner sc =  new Scanner(System.in);

	public static void main(String[] args) {
		// 예제1.키보드로 회원의 등급(1-3)을 입력받아 1이면 "VIP 회원입니다."
		//      2이면 "우수 회원입니다." 3이면 "일반 회원입니다." 그외는 "등급코드가 잘못 입력되었습니다."
		//new SwitchStatementExample().switchMethod1();   // static 없는 거 부르는 방법
		
		// 문제1.1-12월을 입력 받아 1, 3, 5, 7, 8, 10, 12월이면 "31일까지 있는 달입니다."
		//					 4, 6, 9, 11 월이면 "30일까지 있는 달입니다." 2월이면 "28일 혹은 29일까지 있는 달입니다."
		//new SwitchStatementExample().switchMethod2();
		
		// 예제2.등급 매기기
		new SwitchStatementExample().switchMethod3();
		
		// 예제3.화면에 "[1]. 회원신규 등록", "[2]. 회원정보 수정", "[3]. 회원정보 삭제", "[9]. 작업종료"
		//       출력하고 작업번호를 입력 받는 프로그램
		

	}
	
	public void switchMethod1() {
		System.out.print("회원 등급 코드: ");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1 :
			System.out.println("VIP 회원입니다.");  //값이 같으면 최초 break 만날 때까지 실행 => break 없이 실행시키면 전부 출력
			break;
		case 2 :
			System.out.println("우수 회원입니다.");
			break;
		case 3 :
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("잘못된 등급코드입니다.");
		}
	}
	
	public void switchMethod2() {
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			System.out.println("31일까지 있는 달입니다.");
			break;
		case 4:	case 6:	case 9:	case 11:
			System.out.println("30일까지 있는 달입니다.");
			break;
		case 2:
			System.out.println("28일 혹은 29일까지 있는 달입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void switchMethod3() {
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		String grade = "";
		switch (score/10) {
		case 10 :
			grade = "A+";
			break;
		case 9 :
			grade = "A";
			switch(score % 10) {     //10으로 나눈 나머지 => 분류
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
			switch(score % 10) {     //10으로 나눈 나머지 => 분류
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
		System.out.println("점수 " + score + "의 등급은 " + grade + "입니다.");
		}

}
