package LangPackage;

import java.util.ArrayList;

public class Auto_Un_Boxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100));//list에는 객체만 추가가능
        list.add(100);//jdk1.5이전에는 에러.

        Integer i = list.get(0); // list에 저장된 첫번째 객체를 꺼낸다.
//        int ii = list.get(0).intValue(); // intValue()로 Integer를 int로 변환
        int ii = list.get(0); // intValue()로 Integer를 int로 변환//위에꺼랑 동일
    }
}
//오토박싱&언박싱
//-jdk1.5이전에는 기본형과 참조형간의 연산이불가능
//int  = 5;
//Integer iobj = new Integer(7);
//int sun = i + iobj<<에러가남(예전에는)
//int sun = i + iobj.ingValue();<<기본형으로 변환

//int->Integer 오토박싱
//Integer->int 언박싱

//다필요없고 컴파일러가 오토박싱언박싱 알아서 다 해주니깐 쉽게 코드를 작성하면댐

