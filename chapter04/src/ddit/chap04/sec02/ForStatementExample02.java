package ddit.chap04.sec02;

import java.util.Scanner;

public class ForStatementExample02 {

	public static void main(String[] args) {
		//���� 4. 1/1 + 1/2 + 1/3 + ... + 1/10�� ����� ����Ͻÿ�.
		//���� 1. ���ĺ� A-Z�� �� �ٿ� ����Ͻÿ�.
		
		//���� ������ 6�� 11�ϱ��� �����ϼ���..���� 1] 
		
		new ForStatementExample02().forMethod04();

	}

	public void forMethod01() {
		//�����ϸ� �� 0�̴ϱ� double
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
		for(char a = 'A'; a <= 'Z'; a++) {  //����ȭ => ����� ����
			System.out.print(" " + a);
		}
		
	}
	
	//���� 1. 1 - 2 + 3 - 4 + 5 - ... -10=?	
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
	
	//���� 2] Ű����� �ܾ �Է� �޾� �ܾ ���Ե� ����(a,e,i,o,u)�� ���� ����Ͻÿ�.
	public void forMethod04() {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("�ܾ� �Է�: ");
		//String word = sc.next();
		
		int num = 0;
		char a = 'A';
		
		if(a == 'a') {
			num += 1;
		}
		
		System.out.println(num);
	}
	
	//���� 3] 1-50 ���̿� �����ϴ� fibonacci ������ ����Ͻÿ�
	//** fibonacci ���� : ù ���� �ι�°���� 1�� �־����� �� ��������
	//   �� �� ���� ���� ������� �Ǵ� ����
	//    => �ڷ� �˻��˰��� ���(�ǳ볪ġ �˻�)
}
