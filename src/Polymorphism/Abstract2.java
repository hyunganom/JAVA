package Polymorphism;


public class Abstract2 {
    public static void main(String[] args) {
        Player1 ap = new AudioPlayer1(); // 다형성
        ap.play(100);
        ap.stop();
    }
}

abstract class Player1{
    abstract void play(int pos);
    abstract void stop();

}
//추상클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer1 extends Player1{

    @Override
    void play(int pos) {
        System.out.println(pos+"위치 부터 play합니다.");
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다");
    }
}