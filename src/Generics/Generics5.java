package Generics;

import java.util.HashMap;

public class Generics5 {
    public static void main(String[] args) {
        HashMap<String, Student1> map = new HashMap<>(); //JDK1.7부터 생성자에 타입지정 생략가능
        map.put("자바왕",new Student1("자바왕",1,1,100,100,100));

        //public Student1(Object) get(Object key)
        Student1 s = map.get("자바왕");

        System.out.println(map.get("자바왕").name);
    }


}
class Student1{
    String name = "";
    int ban; //반
    int no; //번호
    int kor;
    int eng;
    int math;

    public Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
//HashMap<K,V>
//-여러 개의 타입 변수가 필요한 경우, 콤마()를 구분자로 선언










