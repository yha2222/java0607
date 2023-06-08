package ddit.chap04.sec02;

public class ForStatementExample02 {

	public static void main(String[] args) {
		//예제 4. 1/1 + 1/2 + 1/3 + ... + 1/10의 결과를 출력하시오.
		//문제 1. 알파벳 A-Z를 한 줄에 출력하시오.
		//숙제 1. 1 - 2 + 3 - 4 + 5 - ... - 10 결과 출력
		
		new ForStatementExample02().forMethod02();

	}

	public void forMethod01() {
		//정수하면 다 0이니까 double
		double result = 0;
		String expr = "";
		
		for(int i = 1; i < 11; i++) {
			result += (1/(double)i);
			if(i != 10) {
				expr = expr + (1 + "/" + i + "+");
			} else {
				expr = expr + (1 + "/" + i + "=");
			}
		}
		System.out.println(expr + result);
	}
	
	public void forMethod02() {
		for(char a = 'A'; a <= 'Z'; a++) {
			System.out.print(" " + a);
		}
		
	}
}
