package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExample01 {

	public static void main(String[] args) {
		ifStatement is = new ifStatement();
		//is.method1();
		is.method2();

	}

}

class ifStatement{
	//예1)키보드로 정수 입력 받아 60점 이상이면 "합격" 출력
	Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		if(score >= 60) {
			System.out.println("합격");
		}
	}
	
	public void method2() {
		//예2)컴퓨터 -> 1~50의 난수 발생, 사용자 -> 1~50의 숫자 입력받아 컴퓨터의 난수 맞추기
		//    사용자 입력 수 < 컴퓨터 발 난수 => "더 큰 수를 입력하세요" 출력
        //	    사용자 입력 수 > 컴퓨터 발 난수 => "더 작은 수를 입력하세요" 출력
        //	    사용자 입력 수 = 컴퓨터 발 난수 => "정답입니다" + 시도횟수 출력
		// 컴퓨터 수, 사용자 수, 시도횟수(+=1)
		
		int com = (int)(Math.random()*50)+1;    //컴퓨터 발 난수
		int count = 0; 							//시도횟수
		
		while(true) {							//몇번 시도할지 모르니까 one roof
			System.out.print("숫자 입력(1~50) : ");
			int user = sc.nextInt();
			count++;
			
			if(com > user) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(com < user) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("정답입니다.");
				System.out.println("시도횟수: " + count);
				break;
			}
		}
	}
}