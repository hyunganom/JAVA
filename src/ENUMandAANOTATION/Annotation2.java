package ENUMandAANOTATION;
public class Annotation2 {
    public static void main(String[] args) {

    }
}
//@Override
class Parent{
    void parentMethod(){}
}
class Child extends Parent{
//    @Override
//    void parentmethod(){} // 조상의 메서드의 이름을 잘못 적었음.

//    @Deprecated
//    void parentMethod() {
//        super.parentMethod();
//    }
}
//@Deprecated
//-앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
//-@Deprecated의 사용 예, Date클래스의 getDate()

//@FunctionalInterface  //함수형 인터페이스는 하나의 추상메서드만 가능
//interface Testable{
//    void test();
//    void check(); // 에러
//}