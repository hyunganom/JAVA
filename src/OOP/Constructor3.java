package OOP;

public class Constructor3 {

	public static void main(String[] args) {
		Car c = new Car("white", "auto", 4);
	}

}
class Car {
	String color;
	String gearType;
	int door;
	Car(){}
	Car(String c, String g, int d){ // 매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}

//위에 메인메서드에 저렇게 간단하게 생성 할 수 있다.
//월래는
//Car c = new Car();
//c.color = "white";
//c.gearType = "auto";
//c.door = 4;
//이렇게 적어야 함
