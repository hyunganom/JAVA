package Thread;

public class Thread3 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx11_1 t1 = new ThreadEx11_1();
        ThreadEx11_2 t2 = new ThreadEx11_2();

        t1.start();
        t2.start();
        startTime = System.currentTimeMillis();
        try {
            t1.join();//main쓰레드가 t1의 작업이 끝날 때까지 기다린다.
            t2.join();//main쓰레드가 t2의 작업이 끝날 때까지 기다린다.
        }
        catch (InterruptedException e){}
        System.out.print("소요시간:"+(System.currentTimeMillis()-startTime));
    }
}

class ThreadEx11_1 extends Thread{
    public void run(){
        for(int i=0; i<300;i++){
            System.out.println(new String("-"));;
        }
    }
}

class ThreadEx11_2 extends Thread{
    public  void run(){
        for (int i=0;i<300;i++){
            System.out.println(new String("|"));
        }
    }
}
//main쓰레드
//main메서드의 코드를 수행하는 쓰레드
//-쓰레드는 '사용자 쓰레드'와 '데몬 쓰레드' 두 종류가 있다.

