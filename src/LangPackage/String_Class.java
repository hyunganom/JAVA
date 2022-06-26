package LangPackage;

public class String_Class {
}
//string 클래스
//문자열을 다루는데 사용되는 클래스
//String 클래스 : 데이터(char[])+메서드(문자열관련)
//string클래스는 내용을 변경할 수 없다.불변(immutable)클래스

//예를들어
//String a = "a";
//String b = "b";
//a = a+b; 를 하면 "ab"가 나오긴하는데 새로운 주소에 저장이 되는곳에서 호출을 부름
//그러므로 덧셈 연산자를 이용한 문자열 결합은 성능이 떨어짐 : 왜? 계속 주소를 만드니깐
//문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용
