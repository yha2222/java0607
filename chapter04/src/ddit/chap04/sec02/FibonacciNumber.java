package ddit.chap04.sec02;

public class FibonacciNumber {
	//문제 3] 1-50 사이에 존재하는 fibonacci 수열을 출력하시오
	//** fibonacci 수열 : 첫 수와 두번째수가 1로 주어지고 그 다음부터
	//   전 두 수의 합이 현재수가 되는 수열
	//    => 자료 검색알고리즘에 사용(피노나치 검색)

	public static void main(String[] args) {
		//변수 세 개 필요
		int pp =  1;   //전전수
		int p  = 1;    //전수
		int c = 0;     //현재수

		System.out.printf("%3d%3d, ", 1, 1);
		for(int i = 1; i <= 50; i++) {
			c = pp + p;
			if(c > 50) {
				break;
			}
			System.out.printf("%3d", c);
			//p = c;   //p = 2 => 오버라이드
			//pp = p;  //pp = 2
			pp = p;
			p = c;
		}
	}

}
