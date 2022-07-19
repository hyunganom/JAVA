package Thread;

public class Join_yield {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        ThreadEx13_2 th2 = new ThreadEx13_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        }catch (InterruptedException e){}

        System.out.print("소요시간:" + (System.currentTimeMillis() - Join_yield.startTime));
    }
}

class ThreadEx13_1 extends Thread{
    public  void run(){
        for (int i=0;i<300;i++){
            System.out.print(new String("-"));
        }
    }
}

class ThreadEx13_2 extends Thread{
    public void run(){
        for (int i=0;i<300;i++){
            System.out.print(new String("|"));
        }
    }
}
//join()
//-지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다.
//이것도 똑같이 예외처리를 해야한다.(InterruptedException이 발생하면 작업을 재개)

