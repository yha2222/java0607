package study.report0623;

public class Prac0623 {
	 
//	문제 4 – 정수형 원점의 좌표(x,y)와 실수 타입의 가로와 세로를 입력받아 사각형을 만드는 클래스를 설계하고,
//	3 개의 사각형을 만든 뒤 첫 번째 사각형에 나머지 두 개의 사각형이 포함되었는지 여부를 판단할 수 있는 메서드를 포함시키시오.
	 
//	문제 5 - 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.
//	· 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
//	· 메소드 getVolume()은 원통의 부피를 반환
//	· Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
//	· 다음은 원을 나타내는 클래스 Circle
//	publicclassCircle {
//	publicdoubleradius;
//	publicstaticdoublePI= 3.141592;
	 
	//생성자 구현
//	publicCircle(doubleradius) {
//	this.radius = radius;
//	}
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
//	publicdoublegetArea() {
//	returnradius * radius *PI;
//	}
	 
//	문제 6 - 위에서 구현한Cylinder를 다음 조건에 맞도록 기능을 추가하여 작성하시오.
//	· 다음과 같은 객체 생성이 가능하도록 생성자를 구현
//	. Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
	 
//	문제 7 – 위 1번에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.
//	· 필드를 모두 private로 하고, getter와 setter를 구현하고
//	· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당 한 값을 입력 후 출력
	 
//	문제 8 - 다음 요구사항에 맞는 메소드와 객체를 생성하여라.
//	[직원 클래스]
	 
//	⦁ 직원 정보를 가지고 있는 Employee 클래스가 있다.
//	⦁ 이 클래스를 사용하여 직원들의 사번, 이름, 부서, 직급, 나이, 성별, 연봉, 연락처, 주소 등의 정보를 관리할 것이다.
	 
//	Employee e = new Employee();
	 
//	1. 직원 정보 관리를 위한 객체를 생성할 때 반드시 사번, 이름, 부서, 직급의 정보가 있어야 한다.
//	2. 생성된 직원의 연봉을 설정할 수 있다.
//	3. 급여는 연봉에서 12개월을 나눈 값으로 지급하나 매달 세금으로 급여의 8%를 빼고 수령받게 될 것이 다. 따라서 급여 정보를 반환하는 메서드는 위의 사항을 고려하여 값이 반환될 수 있게 해야 한다.
//	4. 회사 내규에 따라 연봉 협상은 현재 연봉의 2.5% 까지만 최대로 올릴 수 있다. 이는 모든 직원들이 동 일하다. 단, 전년도 실적에 따라 더 높이거나 낮출 수는 있다.
	 
//	문제 9 - 다음을 만족하는 클래스 Account를 작성하시오.
//	· 다음의 2 개의 필드를 선언
//	privateStringowner;
//	private longbalance;
//	· 위 모든 필드에 대한 getter와 setter의 구현
//	· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
//	문제 10 - 위에서 구현된 클래스 Account에서 다음 기능을 추가하여 작성하시오.
//	· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
//	publiclongdeposit(longamount)
	 
//	· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
//	publiclongwithdraw(longamount)
	 
//	· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
	 
//	문제 11 - 위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
//	· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
//	· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력
	 
//	문제 12 -다음을 만족하는 클래스 Rectangle을 작성하시오.
//	· 사각형의 가로와 세로로 객체를 생성하는 생성자
//	· 면적을 반환하는 메소드 getArea(), 둘레를 반환하는 메소드 getCircumference(),
//	· 다음과 같이 클래스 Rectangle 이용
//	Rectangle rc =newRectangle(3.82, 8.65);
//	System.out.println("면적: "+ rc.getArea());
//	System.out.println("둘레: "+ rc.getCircumference());
}
