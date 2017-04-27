package person;

public class Student extends Person {
	public Student() {
		// 자식 생성자에서 특별난 부모 생성자를 호출하지 않으면
		// 자식이 기본 생성자이든 매개변수를 가진 생성자이든
		// 자동으로 부모의 디폴트 생성자가 호출된다.
		// super();
		System.out.println("Student() 호출");
	}
	
	void test(){
		//protected는 자식 + 같은 패키지에서 접근 가능
		age = 10;
	}
}
