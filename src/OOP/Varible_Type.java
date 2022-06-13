package OOP;

public class Varible_Type {
	int iv; 		//인스턴스 변수
	static int cv;	// 클래스 변수(static변수, 공유변수)
	
	void method() {
		int lv=0;	//지역변수
	}
	public static void main(String[] args) {
		Card c = new Card(); //객체생성
		c.kind = "HEART";//객체사용
		c.number = 5;//객체사용
		
		Card.width = 200;//객체사용 자 여기서 주의 cv는 앞에 클래서를 붙이자
		Card.height = 300;//왜냐면 앞에 c.width를 사용해도되간함 근데 앞에 클래스를 붙이셈
	}
}
	//영역 1: 클래스영역  2:메서드 영역
	//클래스 영역에서는 선언문만 가능 예를들어)y=x+3이라던가 system.out.println 등등 이런건 못들어감
	//선언문에는 순서는 상관없음
 	//객체는 iv변수들 묶음이다.
	//-----------------------------------------------
	//자바의 정석 카드르 떠올려보자
	//카드에서 무늬나 숫자는 변하니깐 인스턴스변수로 두고
	//높이랑 폭은 고정되어야하니깐 스태틱을 줘서 고정되게
class Card{
	String kind;		//무늬
	int number;			//숫자
	
	static int width = 100;		//폭		
	static int height = 250;	//녹이	
}
