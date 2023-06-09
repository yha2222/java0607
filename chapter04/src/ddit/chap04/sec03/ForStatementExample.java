package ddit.chap04.sec03;

public class ForStatementExample {

	public static void main(String[] args) {
		new ForStatementExample().shape1();
		System.out.println("2)");
		new ForStatementExample().shape2();
		System.out.println("3)");
		new ForStatementExample().shape3();
		System.out.println("4)");
		new ForStatementExample().shape4();
		System.out.println("5)");
		new ForStatementExample().shape5();
		System.out.println("6)");
		new ForStatementExample().shape6();
	}
	
	public void shape1() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");    //ºÙ¿©¼­ ÀÎ¼â
			}
			System.out.println();         //ÁÙ¹Ù²Þ
		}
	}
	
	public void shape2() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");   
			}
			System.out.println();       
		}
	}
	
	public void shape3() {
		for(int i = 0; i < 5; i++) {
			//°ø¹éÀÎ¼â
			for(int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");   
			}
			System.out.println();       
		}
	}
	
	public void shape4() {
		for(int i = 0; i < 5; i++) {
			//°ø¹éÀÎ¼â
			for(int j = 0; j <= i - 1; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");   
			}
			System.out.println();       
		}
	}
	
	public void shape5() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			
			//i * 2 + 1
			for(int j = 0; j <= i * 2; j++) {
				System.out.print("*");   
			}
			System.out.println();       
		}
	}
	
	public void shape6() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= 8 - (i * 2) ; j++) {
				System.out.print("*");   
			}
			System.out.println();       
		}
	}

}
