package Thread;

public class DaemonThread1 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThread1()); //  Thread(Runnable r)
        //Thread(Runnable r) : 쓰레드생성자를 호출할때 Runnable 인터페이스를 구현한 클래스의 객체를 넣어줘야한다.
        //Runnable에 구현된 run메서드를 작성해서 쓰레드 생성자에 전달

        t.setDaemon(true);          //이 부분이 없으면 종료되지 않는다.
        //일단 실행되고나면 이걸 데몬으로할지 일반으로 할지 바꿀수가없다.
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep( 1000);
            } catch (InterruptedException e) {}
                System.out.println(i);

                //autoSave의 값이 true이면  autoSave()를 호출한다.
                if (i == 5) autoSave = true;

        }
        System.out.println("프로그램을 종료합니다.");
        //일반 쓰레드가 모두 종료되고나면 보조쓰레드는 할께없다.
        //그래서 같이 자동종료가 된다.(일반쓰레드가 하나도 없을때)
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);   //3초마다
            } catch (InterruptedException e) {}

            //autoSave의 값이 true이면 autoSave()를 호출한다.
            if(autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}
//데몬 쓰레드(deamoo thread)
//-일반 쓰레드(non-daemon thread)의 작업을 돕는 보조적인 역활을 수행
//-일반 쓰레드가 모두 종료되면 자동적으로 종료된다. (데몬쓰레드는 어파피 보조역활이기 때문에 일반쓰레드가 종료되면 종료)
//가비지 컬렉터, 자동저장, 화면 자동갱신 등에 사용된다.
//-무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이　만족되면　작업을　수행하고　다시　대기하도록　작성한다．

//void setDaemon(boolean on) : 쓰레드를 데몬 쓰레드로  또는 사용자쓰레드로 변경 매개변수를 on을 true로 지정하면 데몬쓰레드가 된다.

//1 쓰레드클래스 상속받아서 구현
//2 Runnable인터페이스 구현

