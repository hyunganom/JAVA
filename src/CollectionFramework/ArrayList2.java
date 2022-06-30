package CollectionFramework;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        //기본 길이(용량, capacity)가 10인 Arraylist를 생성
        ArrayList list1 = new ArrayList(10);
        //ArrayList에는 객체만 저장가능
        //autoBoxing에 의해서 기본형이 참조형으로 자동 변환

//        list1.add(new Integer(5));
        list1.add(5);
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //ArrayList(collection c)
        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 1 <= X < 4 (4는 안들어감)
        //subList() : ArrayList에 일부를 뽑아서 새로운 리스트를 만듬 (읽기전용)
        print(list1,list2);


        //Collection은 인터페이스 Collections는 인터페이스
        Collections.sort(list1);    //list1과 list2를 정렬한다.
        Collections.sort(list2);    //Collections.sort(List l)
        print(list1,list2);


        //cotainsAll : list1이 list2의 모든요소를 포함하고있는지
        System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1,list2);

        list2.set(3, "AA");
        print(list1,list2);

        list1.add(0,"1");//문자열 "1"을 추가
        //indexOf()는 지정된 객체의 위치(인덱스)를 알려준다
        System.out.println("index="+list1.indexOf("1"));
        list1.remove(0); //인덱스가 1인 객체를 삭제
        list1.remove(new Integer(1));

        //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));

        print(list1,list2);

        //list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i= list2.size()-1; i>=0; i--){ // 이내용 복습
            //1.get(i)으로 list2에서 하나씩 꺼낸다.
            //2.contains()로 꺼낸 객체가 list1에 있는지 확인
            //3.remove(i)
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }
    
    static void print(ArrayList list1,ArrayList list2 ){
        System.out.println("list1 : "+list1);
        System.out.println("list2 : "+list2);
        System.out.println();
    }
}
