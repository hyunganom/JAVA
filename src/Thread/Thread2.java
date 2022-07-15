package Thread;

public class Thread2 {
    public static void main(String[] args) {
        ThreadEx_1 t1 = new ThreadEx_1();

        Runnable r = new ThreadEx_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
//쓰레드의 구현과 실행
//1.Thread클래스를 상속
//2.Runnable인터페이스를 구현

class ThreadEx_1 extends Thread{ // Thread클래스를 상속해서 쓰레드를 구현
    @Override
    public void run() { //쓰레드가 수행할 작업을 작성
        for (int i = 0;i<5;i++){
            System.out.println(getName());  //조상인 Thread의 getName()호출
        }
    }
}

class ThreadEx_2 implements Runnable{  //Runnable인터페이스를 구현해서 쓰레드를 구현
    public void run(){
        for (int i =0;i<5;i++){
            //Thread.currentThread() - 현재 실행중은 Thread를 반환한다.
            System.out.println(Thread.currentThread().getName());
        }
    }
}
