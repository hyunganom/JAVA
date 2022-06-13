package OOP;

public class Parameter2 {

	public static void main(String[] args) {
		Date2 d = new Date2();
		d.x = 10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
	}
	
	static void change(Date2 d) {//참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = "+d.x);
	}
}
class Date2{int x;}