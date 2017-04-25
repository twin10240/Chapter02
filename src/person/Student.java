package person;

public class Student extends Person {
	void test(){
		//protected는 자식 + 같은 패키지에서 접근 가능
		age = 10;
	}
}
