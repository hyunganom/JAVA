package Exception_Handling;

public class Chained_Exception {
}
//연결된 예외
//한 예외가 다른 예외를 발생시킬 수 있다.
//예외A가 예외B를 발생시키면, A는 B의 원인 예외(cause exception)

//Throwable initCause(Throwable cause)지정한 예외를 원인 예외로 등록
//Throwable getCause() 원인 예외를 반환
