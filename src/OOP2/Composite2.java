package OOP2;

public class Composite2 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
		System.out.println("c.p.x = "+c.p.x);
		System.out.println("c.p.y = "+c.p.y);
		System.out.println("c.r = "+c.r);
	}

}
class Mypoint{
	int x;
	int y;
}

//class Circle extends Mypoint{// 상속
//	int r;
//}

class Circle{ //포함관계
	Mypoint p; //= new Mypoint();
	int r;
	
	Circle() {
		p = new Mypoint();
	}
}