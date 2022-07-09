package Generics;

import java.util.AbstractList;
import java.util.ArrayList;

class Tv{}
class Audio{}

public class Type_Variable {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv타입의 객체만 저장가능

        list.add(new Tv());
//        list.add(new Audio()); -- 에러
//        Tv t = list.get(0);
        Tv t = (Tv) list.get(0);// list의 첫번째 요소를 꺼낸다. ---list의 반환타입이 Object라서 형변환을 해줘야 함.
    }
}
//타입변수
//-지네릭클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용.

//타입 변수에 대입하기
//-객체를 생성시, 타입 변수(E) 대신 실제 타입(Tv)을 지정(대입)
//ArrayList<Tv> tvList = new ArrayList<Tv>();



