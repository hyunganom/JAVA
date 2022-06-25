package Polymorphism;

public class Interface_poly {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(100, 200);

        Fighter f2 = new Fighter();
        f.attack(f2);
        //f.attack(new Fighter()); : 위에 두줄과 같다.

        f.getFightable();
    }
}

abstract class Unit1 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable1 { // 인터페이스의 모든 메서드는 public abstract. 예외없이
    void move(int x, int y);    //public abstract가 생략됨

    void attack(Fightable1 f);
    //인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능
    //즉, Fightable1인터페이스를 구현한 클래스의 인스턴스만 들어와라
}

class Fighter extends Unit1 implements Fightable1 {
    //오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안된다.
    //Fightable1을 상속받네? 엄밀히 말하면 부모는 아닌데 부모처럼 역활 암튼 그럼
    @Override
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y + "]로 이동");
    }

    @Override
    public void attack(Fightable1 f) {
        System.out.println(f + "를 공격");
    }

    //싸울수있는 상대를 불러온다.
    Fightable1 getFightable() {
        Fightable1 f = new Fighter(); //Fighter를 생성해서 반환
        return f;
    }
}