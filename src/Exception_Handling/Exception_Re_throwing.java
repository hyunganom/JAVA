package Exception_Handling;

public class Exception_Re_throwing {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;        //다시 예외를 발생시킨다.
        }
    }
}
//예외 되던지기
//예외를 처리한 후에 다시 예외를 발생시키는 것
//호출한 메서드와 호출된 메서드 양쪽에서 모두 예외를 처리하는것
