package Generics;

import java.util.ArrayList;
import java.util.Objects;

public class Generics {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList list = new ArrayList(); JDK1.5이전
//        ArrayList<Object> list = new ArrayList<Object>(); // JDK1.5이후
        list.add(10);
        list.add(20);
        list.add(30);
//        list.add("30"); //String을 추가

//        Integer i = (Integer) list.get(2); // 컴파일 ok 근데 실행하면 발생에러가 뜨는데 "형변환 에러"
        Integer i = list.get(2); //형변환 생략가능 왜? 이미 지네릭스로 알고있으니깐
        //타입체크가 강화됨. 지네릭스 덕분에

        System.out.println(list);
    }
}
//지네릭스란?
//컴파일시 타입을 체크해 주는 기능(compile-time type check)-JDK1.5
//런타임에러가 뜨면 골아프니깐 그전에 컴파일로 끌어와서 타입을 강화해줌

//지네릭스의 장점
//1.타입 안정성을 제공한다.
//2.타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.