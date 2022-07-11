package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        HashSet list = new HashSet(); //Set은 Collection의 자손
//        Collections list = new HashSet();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        //Iterator는 일회용이라 다쓰고
        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

    }
}
//Iterator, ListIterator, Enumeration
//-컬렉션에 저장된 데이터를 접근(읽어오기)하는데 사용되는 인터페이스
//-Enumeration은 Iterator의 구버전
//-ListIterator는 Iterator의 구버전

//boolean hasNext() 읽어 올 요소가 남아있는지 확인한다. 있으면 true 없으면 false를 반환한다.
//Object next() 다음 요소를 읽어 온다. next()를 호출하기 전에  hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전하다.

//-컬렉션에 저장장 요소들을 읽어오는 방법을 표준화한것
