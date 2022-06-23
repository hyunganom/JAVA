package OOP2;

public class Inheritance2 {

	public static void main(String[] args) {
		smartTv stv = new smartTv();
		stv.channel = 10;		//조상 클래스로부터 상속받은 멤버
		stv.channeUp();			//조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCatiom("Hello, world");
		stv.caption = true;		//캡션 자막을 킨다.
		stv.displayCatiom("Hello, world");
	}

}
class Tv{
	boolean power;	//전원 (on/off)
	int channel;	//채널
	
	void power() {power =! power;}
	void channeUp() {++channel;}
	void channeDown() {--channel;}
}

class smartTv extends Tv{	//smartTv는 tv에 캡션(자막)을 보여주는 기능을 말함
	boolean caption;	//캡션상태(on/off)
	void displayCatiom(String text) {
		if(caption) {	//캡션상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}