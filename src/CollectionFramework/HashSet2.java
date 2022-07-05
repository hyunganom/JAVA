package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2","2", "3","3","4","4","4"};
        Set set = new HashSet();

        for (int i=0;i<objArr.length;i++){
            set.add(objArr[i]);     //Hash에 objArr요소들을 저장한다.
        }

        //HashSet에 저장한 요소들을 출력한다.
        System.out.println(set);

        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
