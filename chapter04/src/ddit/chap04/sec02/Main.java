package ddit.chap04.sec02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		//설정한 알람 시간 : H시 M분 => 45분 빨리
	
		int chang = M + 45;
		
		if(H == 24 ) {
			H = 0;
		}
		
	}
	
	public void prac1330() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
	
	public void prac9498() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
	
	public void prac2753() {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4 == 0) && (year%100 != 0) || (year%400 ==0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	
	public void prac14681() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}else if(x < 0 && y > 0) {
			System.out.println("2");
		}else if(x < 0 && y < 0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
	}

}
