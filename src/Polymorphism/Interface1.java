package Polymorphism;

public class Interface1 {
}
//인터페이스
//결론 : 추상 메서드의 집합
//구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)

//interface 인터페이스이름{
//      public static final 타입 상수이름 = 값;
//      public abstract 메서드이름(매개변수목록);
// }

interface PlayingCard{
    public static final int SPADE = 4;
    final int DIAMOND = 3;      //public static final int DIAMOND
    static int HEART = 2;       //public static final int HEART
    int CLOVER = 1;             //public static final int CLOVER

    public abstract String getCardNumber();
    String getCardKind();       //public abstract  String getCardKind();
}

//인터페이스의 조상은 인터페이스만 가능(object가 최고 조상이 아님;
//다중 상속이 가능.(추상메서드는 충돌해도 문제 없음)

interface Fightable extends  Movable, Atttackable{}

interface  Movable{
    //지정된 위치(x,y)로 이동하는 기능의 메서드
    void  move(int x, int y);
}

interface Atttackable{
    void  attack(Unit u);
}