package Exception_Handling;

public class Exception1 {
}
//사용자정의 예외 만들기
//-우리가 직접 예외 클래스를 정의할 수 있다.
//-조상은 Exception(필수처리) 과 RuntimeException(예외처리) 중에서 선택

class MyException extends Exception{
    //에러코드 값을 저장하기 위한 필드를 추가한다.
    private final int ERR_CODE;

    MyException(String msg, int err_code) {//생성자
        super(msg);
        ERR_CODE = err_code;
    }

    MyException(String msg){//생성자
        this(msg,100);      //ERR_CODE를 100(기본값)으로 초기화한다.
    }
    public  int getErrcode(){//에러코드를 얻을 수 있는 메서드도 추가했다
        return ERR_CODE;     //이 메서드는 주로 getMessage()와 함꼐 사용될 것이다.
    }
}

