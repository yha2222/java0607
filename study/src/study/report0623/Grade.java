package study.report0623;
//문제 3 – 세 과목의 성적을 입력 받고 총점과 합을 출력할 수 있는 Grade class를 설계하시오.
public class Grade {
	int kor;
	int eng;
	int mat;
	
	Grade(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void print() {
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("합: " + (kor+eng+mat));
	}
}
