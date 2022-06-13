package Variable;

public class Variable1 {

	public static void main(String[] args) {
		/*변수를 선언하기전 그 전에 반드시 변수를 초기화를 해줘야한다.
		 * 메모리는 여러 프로그램이 공유하는 자원이므로 전에 다른 프로그램에 의해 쓰레기값이 남아 있을 수도 있기때문 */
		
		
		
		int year =0;
		int age = 14;
		System.out.println(year);
		System.out.println(age);
		// 두변수에 값 교환하기
		
		int x=10, y=20;
		int tmp;
		
		tmp=x;
		x=y;
		y=tmp;
		System.out.println(x+" "+y);
	}

}
