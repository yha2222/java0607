package ddit.chap04.sec02;

public class prac2 {

	public static void main(String[] args) {
		new prac2().p15202();

	}
	
	public void p140() {
		
		int lotto = 0;
		
		for(int i = 0; i < 7; i++) {
			lotto = 0;
			int num = (int) (Math.random() * 45) + 1;
			lotto += num;
			System.out.println(lotto);
		}
	}
	
	public void p14301() {
		int time = (int) (Math.random()*4)+8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의 시작");
		case 10:
			System.out.println("업무 시작");
		default:
			System.out.println("외근 시작");
		}
	}
	
	public void p14302() {
		char grade = 'D';
		
		switch(grade) {
		case 'A': case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B': case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}
	
	public void p144() {
		String position = "장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}
	
	public void p15201() {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i-1) +"합: " + sum);
	}
	
	public void p15202() {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);   //0.1=float => 정확하게 표현 X => 루프 9번
		}
	}
	
	public void p154() {
		int i = 1;

	}

}
