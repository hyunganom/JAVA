package LangPackage;

public class HashCode {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.hashCode());    //96354
        System.out.println(str2.hashCode());    //96354

    }
}
//해쉬코드
//객체의 해시코드를 반환하는 메서드
//해시코드 : 정수값~~~해싱이라는 알고리즘에서 사용하긴함
//object 클래스의 hashcode()는 객체의 주소를 int로 변환해서 반환
//그래서 해시코드를 객체의 지문이라고도 함

//equals()를 오버라이딩하면, hashcode()도 오버라이딩 해야함
//equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문!!!
//equals()의 결과가 true인 경우에는 해시코드도 일치하도록 해야한다(규칙임)


