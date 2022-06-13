package OOP;

public class Static_instance_Method {

}
class MyMath2{
	long a, b;
	
	long add() { //인스턴스 메서드
		return a+b;
	}
	
	static long add(long a, long b) {// 클래스 메서드(static메서드)
		return a+b;
	}
}

//인스턴스메서드
//인스턴스 생성 후 '참조변수.메서드이름()'으로 호출
//인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드
//메서드 내에서 인스턴스 변수(iv) 사용가능

//static 메서드(클래스메서드)
//객체생성없이 '클래스이름.메서드이름()'으로 호출
//인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
//메서드 내에서 인스턴스 변수(iv) 사용불가

//그럼 static은 언제 붙일까? : 속성(멤버변수) 중에서 공통 속성에 static을 붙인다.
//메서드는 static을 붙일때 인스턴스 멤버(iv, im)을 사용하지 않는 메서드에 static을 붙인다.