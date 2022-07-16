package Thread;

import javax.swing.*;

public class Thread4 {
    public static void main(String[] args) {
        ThreadEx5_1 t1 = new ThreadEx5_1();
        t1.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값은"+input+"입니다.");
    }
}

class ThreadEx5_1 extends Thread{
    public void run(){
        for (int i =10;i>0;i--){
            System.out.println(i);
            try {
                sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
//쓰레드의 I/O 블락킹(blocking)
//싱글쓰레드로 프로그램을 작성을 하면 작업도중 블락킹이 발생하는 일이있다.(예를들어 아무값입력~~)
//그러면 처음 작업을 수행이 끝날때까지 다음작업은 계속 대기중...이러면 시간적 손실이 발생한다.
//그러나 멀티 쓰레드로 작업을하면 전 작업이 대기를 하는동안 다른 쓰레드는 작업을 계속수행하게 되는데 시간적 단축이 좋다.