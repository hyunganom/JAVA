package OOP2;


public class Single_Inheritance {
}
//단일 상속
//java는 단일 상속만을 허용한다.

class MyTv{
	boolean power;
	int channel;
	
	void power() {power =! power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class DvD{
	boolean power;
	
	void power() {power =! power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

class TvDvd extends Tv{
	DvD d = new DvD();
	
	void play() {
		d.play();
	}
	void stop() {
		d.stop();
	}
	void rew() {
		d.rew();
	}
}
//비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.