package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMap4 {
    public static void main(String[] args) {

        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

                HashMap map = new HashMap();

        for (int i =0 ; i< data.length;i++){
            if(map.containsKey(data[i])){ // 처음에 "A"를 포함하고 있냐? - 근데 첨에는 아무것도 없음 그래서 else로 감
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i],new Integer(value.intValue()+1));
            }else {
                map.put(data[i],1);
            }
        }

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey()+" : "+printBar('#',value)+" "+value);
        }
    }

    public static String printBar(char ch,int value){
        char[] bar = new char[value];

        for(int i=0;i< bar.length;i++)
            bar[i] = ch;

        return new String(bar);
    }
}
