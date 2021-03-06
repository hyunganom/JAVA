package CollectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*; // Collections를 생략가능

public class Collections2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list,2);     // 배열의 각요소들을 오른쪽으로 2칸씩 회전
        System.out.println(list);

        swap(list, 0,2);    // 첫번째와 세번째를 교환
        System.out.println(list);

        shuffle(list);      //저장된 요소의 위치를 임의로 변경
        System.out.println(list);

        sort(list, reverseOrder());     //역순 정렬 reverse(list)와 동일
        System.out.println(list);

        sort(list);
        System.out.println(list);       //정렬

        int idx = binarySearch(list, 3); //인덱스 3이 저장된 위치(index)를 반환
        System.out.println("idx = "+idx);

        System.out.println("max = "+max(list));
        System.out.println("min = "+min(list));
        System.out.println("min = "+max(list, reverseOrder()));

        fill(list, 9); //list를 9로 채운다
        System.out.println(list);

        //list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
        List newList = nCopies(list.size(),2);
        System.out.println("newList = "+list);

        System.out.println(disjoint(list,newList));

        copy(list,newList);
        System.out.println("list = "+list);
        System.out.println("newList"+newList);

        replaceAll(list,2,1);
        System.out.println("list = "+list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2 = "+list2);




    }
}
