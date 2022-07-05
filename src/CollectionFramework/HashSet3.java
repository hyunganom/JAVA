package CollectionFramework;

import java.util.*;

public class HashSet3 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i=0;set.size()<6;i++){
            int num = (int)(Math.random()*45)+1;
            set.add(new Integer(num));
        }
        //Set은 정렬이 불가능하다 그래서 Set을 List로 옮기고 List를 정렬
        List list = new LinkedList(set); //LinkedList(Collection c)
        Collections.sort(list);          //Collections.sort(List list)
        System.out.println(list);
    }
}
