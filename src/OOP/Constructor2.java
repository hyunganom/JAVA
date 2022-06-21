package OOP;

public class Constructor2 {

	public static void main(String[] args) {
		Date_1 d1 = new Date_1();
		Date_2 d2 = new Date_2();
	}

}
class Date_1{
	int value;
//	Date_1(){} : 기본생성자 추가 이게 없어도 됨 왜냐면 생성자가 1개라도 있으면 이걸 만들어줘야 하는데 지금안에 생성자가 없으니 자동으로 만들어줌
}

class Date_2{
	int value;
	
	Date_2(int x){
		value=x;
	}

	Date_2() {}// 기본 생성자 위에 하나 있으니깐 기본생성자를 만들어 줘야함.
}
