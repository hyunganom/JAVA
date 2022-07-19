package Thread;

public class Suspend_resume {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("*");
        MyThread th2 = new MyThread("**");
        MyThread th3 = new MyThread("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();  //쓰레드 th1을 잠시 중단시킨다.
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();   //쓰레드 th1이 다시 동작하도록 한다.
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e){}

    }
}
class MyThread implements Runnable{
   volatile boolean suspended = false;
   volatile boolean stopped = false;

    Thread th;

    MyThread(String name){
        th = new Thread(this, name); // Thread(Runnable r, String name)
    }
    void  start(){
        th.start();
    }
    void stop(){
        stopped = true;
    }
    void suspend(){
        suspended = true;
    }
    void resume(){
        suspended = false;
    }
    public void run(){
        while (!stopped){
            if (!suspended){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){}
            }

        }
    }
}
//suspend(), resume(), stop()
//-쓰레드의 실행을 일시정지, 재개, 완전정지 시킨다.

//suspend(), resume(), stop()은 교착상태에 빠지기 쉬워서 deprecated되었다.(간단한 프로그램은 상관없는데 앵간하면 쓰지마래)


