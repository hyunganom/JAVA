package Polymorphism;
public class Polymorphism2 {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();

        Car c = (Car)f; //ok. 조상인 car타입으로 형변환(생략가능)
        FireEngine f2 = (FireEngine)c; // ok. 자손인 FireEngine타입으로 형변환(생략불가)

//        c.water(); ---컴파일에러!!! Car타입의 참조변수로는 water()를 호출할수가 없다.

        //참조변수 형변환을 통해서 5개를 쓸수있는걸 4개로만 쓸수있게 바꾼것이다.
        //자 참조변수 f는 5개 전부 다쓸수있다. 근데 참조변수 c는 4개만 쓸수있다.(객체주소값은 같은것을 가리킴) 왜? 월래 c는 4개니깐
    }
}
//참조변수의 형변환
//사용할 수 있는 멤버의 갯수를 조절하는 것

class Car {
    String color;
    int door;

    void drive() {
    }

    void stop() {
    }

}
class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }

}