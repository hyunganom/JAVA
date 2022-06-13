package OOP2;

public class Overriding1 {
	public static void main(String[] args) {
//	Point3D p = new Point3D();
//	p.x = 3;
//	p.y = 5;
//	p.z = 7;
//	System.out.println(p.getLocation());
		
		
//	Point2 p2 = new Point2();
//	p2.x=2;
//	p2.y=3;
//	System.out.println(p2);
//	System.out.println(p2.toString());
		
	Point2 p3 = new Point2(3, 5);
	System.out.println(p3);
		
	}
}
//오버라이딩 : 덮어쓰다
//상속받는 조상의 메서드를 자신에 맞게 변경하는 것

//오버라이딩의 조건
//1.선언부가 조상 클래스의 메서드와 일치해야 한다.
//2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//3.예외는 조상 클래스의 메서드보다 많이 선얼할 수 없다.

class Point{
	int x;
	int y;
	
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
}

class Point3D extends Point{
	int z;
	
	String getLocation() {
		return "x : "+ x +", y : "+ y +", z : "+z;
	}
}

class Point2 extends Object{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}