package ddit.chap04.sec02;

public class FibonacciNumber {
	//���� 3] 1-50 ���̿� �����ϴ� fibonacci ������ ����Ͻÿ�
	//** fibonacci ���� : ù ���� �ι�°���� 1�� �־����� �� ��������
	//   �� �� ���� ���� ������� �Ǵ� ����
	//    => �ڷ� �˻��˰��� ���(�ǳ볪ġ �˻�)

	public static void main(String[] args) {
		//���� �� �� �ʿ�
		int pp =  1;   //������
		int p  = 1;    //����
		int c = 0;     //�����

		System.out.printf("%3d%3d, ", 1, 1);
		for(int i = 1; i <= 50; i++) {
			c = pp + p;
			if(c > 50) {
				break;
			}
			System.out.printf("%3d", c);
			//p = c;   //p = 2 => �������̵�
			//pp = p;  //pp = 2
			pp = p;
			p = c;
		}
	}

}
