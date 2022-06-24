package Exception_Handling;

public class PrintStackTrace {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();//참조변수 ae를 통해. 생성된 ArithmeticException인스턴스에 접근할 수 있다.
            System.out.println("예외메세지 : " + ae.getMessage());
        }
        System.out.println(6);
    }
}
//printStackTrace()
//예외발생 당시의 호출스택(call stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.

//getMessage()
//발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

//예를 들어 예외가 발생하면 ArithmeticException 객체 안에 printStackTrace랑 getMessage 메서드가 포함되어있음