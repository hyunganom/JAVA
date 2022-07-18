package Thread;

public class Sleep_Interrupt_1 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

        deley(2*1000);

//        try {
////            th1.sleep(2000); //이거는 th1이 잠든게 아니고 main이 잠든거임 sleep은 누굴 잠들게 할수없음
//            Thread.sleep(2000); // 이렇게 써줘야하고, 2초뒤에 맡애꺼가 출력이됨.
//        } catch (InterruptedException e){}

        System.out.println("<<main 종료>>");
    }

    static void deley(long millis){ //try catch필수로 해줘야 한다.
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){}
    }
}//main

class ThreadEx8_1 extends Thread{
    public void run(){
        for (int i=0; i<300;i++){
            System.out.print("-");
        }
        System.out.println("<<th1 종료>>");
    }
}

class ThreadEx8_2 extends Thread{
    public void run(){
        for (int i=0;i<300;i++) System.out.print("|");
        System.out.print("<<th2 종료>>");
    }

}
