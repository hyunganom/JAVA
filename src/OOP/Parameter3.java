package OOP;

public class Parameter3 {

	public static void main(String[] args) {
		Date3 d = new Date3();
		d.x = 10;
		
		Date3 d2 = copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
	}
	static Date3 copy(Date3 d) {
		Date3 tmp = new Date3();	//새로운 객체를 생성한다
			
		tmp.x = d.x;				// d.x의 값을 tmp.x에 복사한다
		
		return tmp;					//복사한 객체의 주소를 반환한다.
	}
}
class Date3{int x;}