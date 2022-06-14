package OOP2;
public class Encapsulation {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(21);
        System.out.println(t.getHour());
    }
}
class Time{
    private int hour;
    private int minute;
    private int second;

    public int getHour(){return hour;}        //간접적으로 접근을 허용한다다
    public void setHour(int hour){
        if(hour <0 || hour>23){
            return;
        }
        this.hour = hour;
    }
}

//접근제어자를 사용하는 이유가
//외부로부터 데이터를 보호하기위해서 인데
//저말의 뜻은 위에 시간은 24시까지인데 데이터에 20억시간 이런걸 넣을수가 없으니깐 접근을 제한함
//외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서
