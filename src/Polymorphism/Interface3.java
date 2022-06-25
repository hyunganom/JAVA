package Polymorphism;

public class Interface3 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        a.method(new C());

    }
}
//인터페이스의 장점
//두 대상(객체)간의 '연결, 대화, 소통'을 돕는 '중간 역활'을 한다.
//선언과 구현을 분리시킬 수 있게 한다.

class A {
    public void method(I i) { // 인터페이스 I를 구현한 넘들만 들어와라
        i.method();
    }
}
// B클래스의 선언과 구현을 분리
interface I{
    public void method();
}
class B implements I {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I {
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}