package ddit.chap04.sec02;

public class ForStatementExample01 {  //public class 딱 하나!

	public static void main(String[] args) {
		//for문 예제
		//예제 1. 1-100 사이의 정수를 모두 출력하시오.
		//예제 2. 1-100 사이의 모든 수를 더한 값을 출력하시오.
		//예제 3. 1-100 사이에 존재하는 짝수와 홀수의 합을 출력하시오.

		ForStatement fs = new ForStatement();  
		fs.forMethod02();
		//클래스를 객체로 사용하는 방법 => 재사용 reuse
		//() 붙으면 무조건 method, new => 배열, 클래스에만 쓰임 => heap memory
	}

}

class ForStatement {					          //일반 클래스
	public void forMethod01() {
		for(int i = 1; i < 101; i++) {
			System.out.print(i + " ");            //i => 반복 제어 => 제어 변수
		}
		
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("\n합= " + sum);		  //i => 반복 제어 => 제어 변수
		
		int odd = 0; 							  //홀수 합
		int even = 0; 							  //짝수 합
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);
		System.out.println("전체 합: " + (even+odd));
	}
	
	public void forMethod02() {
		int y = 2023;
		int month = 6;
		int d = 8;
		int days = 0;  //전체 경과 일수
		for(int year = 1; year < y; year++) {     //2023은 아직 안 지나갔으니까 포함 X
			//윤년 평년 구별
			if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
				//윤년 : 366일
				days += 366;
			}else {
				days += 365;
			}
		}
		for(int m = 1; m < month; m++) {		  //6월도 아직 안 지나갔으니까 포함 X
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
		days = days + d;  //지난 일 + 6월 경과한 일수
		System.out.println("서기 1년 1월 1일부터 오늘까지 경과된 일수는 " + days +"일 입니다.");
		switch(days%7) {
		case 0 :
			System.out.println("일요일입니다.");
			break;
		case 1 :
			System.out.println("월요일입니다.");
			break;
		case 2 :
			System.out.println("화요일입니다.");
			break;
		case 3 :
			System.out.println("수요일입니다.");
			break;
		case 4 :
			System.out.println("목요일입니다.");
			break;
		case 5 :
			System.out.println("금요일입니다.");
			break;
		case 6 :
			System.out.println("토요일입니다.");
			break;
		case 7 :
			System.out.println("일요일입니다.");
			break;
		}
	}
}