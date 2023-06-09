package ddit.chap04.sec02;

import java.util.Scanner;

public class ForStatementExample02 {

	public static void main(String[] args) {
		//예제 4. 1/1 + 1/2 + 1/3 + ... + 1/10의 결과를 출력하시오.
		//문제 1. 알파벳 A-Z를 한 줄에 출력하시오.
		
		//다음 문제를 6월 11일까지 제출하세요..문제 1] 
		
		new ForStatementExample02().forMethod04();

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
		for(char a = 'A'; a <= 'Z'; a++) {  //순서화 => 제어변수 가능
			System.out.print(" " + a);
		}
		
	}
	
	//문제 1. 1 - 2 + 3 - 4 + 5 - ... -10=?	
	public void forMethod03() {
		//+ * - = -, - * - = +
		//1- 2+ 3- 4+
		String expr = "";
		int res = 1;
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0 && i != 10) {
				expr += (i + "+");
			}else if(i == 10){
				expr += (i + "=");
			}else {
				expr += (i + "-");
			}
		}
		
		//1-2-(-3)-4-(-5)-6...
		for(int i = 2; i <= 10; i++) {
			
			int a = 0;
			
			if(i%2 != 0) {
				a = -i;
			}else {
				a += i;
			}
			
		 res = res - a;
			
		}
		
		System.out.println(expr + res);   //-5
	}
	
	//문제 2] 키보드로 단어를 입력 받아 단어에 포함된 모음(a,e,i,o,u)의 수를 출력하시오.
	public void forMethod04() {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("단어 입력: ");
		//String word = sc.next();
		
		int num = 0;
		char a = 'A';
		
		if(a == 'a') {
			num += 1;
		}
		
		System.out.println(num);
	}
}
