package OOP;

public class Parameter1 {
	public static void main(String[] args) {
	Date d = new Date(); // new Date(); == 데이터 객체를 생성한다.
	d.x =10;
	System.out.println("main() : x = "+d.x);
	change(d.x);
	System.out.println("After change(d.x)");
	System.out.println("main() : x = "+d.x);
	
	}
	static void change(int x) {//기본형 매개변수
		x = 1000; // 여기서 d.x의 값이 변경된게 아니라 매개변수 x가 변경된거임(지역변수)
		System.out.println("change() : x = " + x);
	}
}
class Date{int x;}
//기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
//참조형 매개변수 - 변수의 값을 읽고 변경 할 수있다..

//매개변수 : 지역변수의 일종으로 메소드 호출할 때 값을 넣어줌
