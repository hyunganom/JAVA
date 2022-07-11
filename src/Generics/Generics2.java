package Generics;

public class Generics2 {
}
//지네릭스 용어
//Box<T>    지네릭 클래스, 'T의 Box'또는 'T Box'라고 읽는다.
//T         타입 변수 또는 타입 매개변수.(T는 타입문자)
//Box       원시 타입(raw Type)

//지네릭 타입과 다형성
//-참조변수와 생성자의 대입된 타입은 일치해야 한다.
// ArrayList<Tv> list = new ArrayList<Tv>();
//-지네릭 클래스 간의 다형성은 성립.(여전히 대입된 타입은 일치해야)
// List<Tv> list = new LinkedList<Tv>();
//-매개변수의 다형성도 성립
//ArrayList<product> List = new ArrayList<product>();
//list.add(new product());
//list.add(new Tv());
//list.add(new Audio());


