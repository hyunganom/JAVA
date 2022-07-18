package Thread;

import javax.swing.*;

public class Sleep_Interrupt_2 {
    public static void main(String[] args) throws Exception {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt(); //interrupt()를 호출하면, interrupted상태가 true가 된다.

//        System.out.println("isInterrupt():" + th1.isInterrupted()); //true
//        //main쓰레드가 interrupt되었는지 확인.
//        System.out.println("interrupted():"+Thread.interrupted()); //false

    }
}

class ThreadEx9_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 2500000000L; x++) ; //시간지연
        }
        System.out.println("isInterrupted() : "+isInterrupted()); // true
        System.out.println("isInterrupted() : "+isInterrupted()); // true

        //isInterrupted()와 달리 interrupted()는 interrupted라는 상태변수로 초기화한다. false로
       System.out.println("interrupted() : "+interrupted()); // true
        System.out.println("interrupted() : "+interrupted()); // false

        System.out.println("카운트가 종료되었습니다.");
    }
}
//interrupt()
//-대기상태(WAITING)인 쓰레드를 실행대기 상태(RUNNABLE)로 만든다.

