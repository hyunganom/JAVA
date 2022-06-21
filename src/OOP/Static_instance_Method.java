package OOP;

public class Static_instance_Method {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200l, 100l));//클래스 메서드 호출 : 객체생성없이 바로 호출가능
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
    }
}
class MyMath2{
	long a, b;
	
	long add() {
		return a+b;
	} //인스턴스 메서드  여기서 a랑 b는 인스턴스 변수
	
	static long add(long a, long b) {// Ŭ���� �޼���(static�޼���)
		return a+b;
	}  //스태틱메서드
}

//인스턴스 메서드
//인스턴스 생성 후 '참조변수.메서드이름()'으로 호출
//인스턴스 멤버(iv, im)와 작업을 하는 메서드
//메서드 내에서 인스턴스 변수(iv) 사용가능

//static 메서드(클래스메서드)ㄴ
//객체생성없이 '클래스이름.메서드이름()'으로 호출
//인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
//메서드 내에서 인스턴스 변수(iv)사용 불가

//그럼 static은 언제 붙일까? : 속성(멤버변수) 중에서 공통 속성에 static을 붙인다.
//메서드는 static을 붙일때 인스턴스 멤버(iv im)을 사용하지 않는 메서드에 static을 붙인다.