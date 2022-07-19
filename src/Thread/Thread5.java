package Thread;

public class Thread5 {
    public static void main(String[] args) {
        ThreadEx6_1 t1 = new ThreadEx6_1();
        ThreadEx6_2 t2 = new ThreadEx6_2();
        
        t2.setPriority(7);

        System.out.println("Priority of t1(-) : "+t1.getPriority());
        System.out.println("Priority of t2(|) : "+t2.getPriority());

        t1.start();
        t2.start();
    }
}

class ThreadEx6_1 extends Thread{
    public void run(){
        for (int i=0; i<300;i++){
            System.out.println("-");
            for (int x=0;x<100000;x++);
        }
    }
}
class ThreadEx6_2 extends Thread{
    public void run(){
        for (int i=0; i<300;i++){
            System.out.println("|");
            for (int x=0;x<100000;x++);
        }
    }
}
//쓰레드의 우선순위(priority of thread)
//-작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있따.
