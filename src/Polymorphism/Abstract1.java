package Polymorphism;

public class Abstract1 {
}
//추상클래스
//미완성 설계도. 미완성 메서드를 갖고 있는 클래스

abstract class Player{//추상클래스(미완성클래스)
    abstract void play(int pos);//추상메서드(몸통{}이 없는 미완성 메서드
    abstract void stop();       //추상메서드
}
//다른클래스 작성에 도움을 주기 위한것... 인스턴스 생성불가
//Player p = new Player(); --- 에러
//상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능
class AudioPlayer extends Player{
    void play(int pos){}        //추상메서드 구현

    void stop() {}              //추상메서드 구현
}