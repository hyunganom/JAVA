package Exception_Handling;

public class Exception_Occur {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e; //예외를 발생시킴
            //throw new Exception{"고의로 발생시켰음")
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
//예외발생시키기
//1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다음
//  Exception e = new Exception("고의로 발생시켰음");
//2.키워드 throw를 이용해서 예외를 발생시킨다.
//  throw e;