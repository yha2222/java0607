package ddit.chap04.sec02;

public class ForStatementExample02 {

	public static void main(String[] args) {
		//���� 4. 1/1 + 1/2 + 1/3 + ... + 1/10�� ����� ����Ͻÿ�.
		//���� 1. ���ĺ� A-Z�� �� �ٿ� ����Ͻÿ�.
		//���� 1. 1 - 2 + 3 - 4 + 5 - ... - 10 ��� ���
		
		new ForStatementExample02().forMethod02();

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
		for(char a = 'A'; a <= 'Z'; a++) {
			System.out.print(" " + a);
		}
		
	}
}
