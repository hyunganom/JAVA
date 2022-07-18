package Thread;

public class Sleep_Interrupt {
}
//sleep() - static(자기자신한테만 동작하도록)
//-현재쓰레드를 지정된 시간동안 멈추게 한다.
//  static void sleep(long millis)  //찬분의 일초 단위

//예외처리를 해야 한다.(InterruptedException이 발생하면 꺠어남)

//   try{
//        Thread.sleep(1,500000)//쓰레드를 0.0015초 동안 멈추게 한다
//   }cath(InterruptedException e){} <---예외를 필수적으로 처리해줘야 한다.
