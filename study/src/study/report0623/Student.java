package study.report0623;
//문제 1 -다음을 만족하는 Student 클래스를 작성하시오.
//String형의 학과와 정수형의 학번을 필드로 선언
//Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
public class Student {
	
	String major;
	int stdNo;
	
	Student(String major, int stdNo){
		this.major = major;
		this.stdNo = stdNo;
	}
	
	public static void main(String[] args) {
		Student s = new Student("국어국문학과", 20220013);

	}

}
