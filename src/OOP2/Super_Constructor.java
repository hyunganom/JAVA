package OOP2;

public class Super_Constructor {
    public static void main(String[] args) {
        Point3D_1 p5 = new Point3D_1(1,2,3);
        System.out.println(p5.getLocation());
    }
}
//super() - 조상의 생성자
//조상의 생성자를 호출할 때 사용
//조상의 멤버는 조상의 생성자를 호출해서 초기화
//참조변수랑 헷갈리지마셈 얘는 생성자임

class Point_1{
    int x, y;
//생성자의 첫 줄에 반드시 생성자를 호출해야 한다.
    public Point_1() {
        this(0,0);
    }

    Point_1(int x, int y){
        super();//컴파일러가 자동으로 추가해준다.
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x :"+ x + ", y : " + y ;
    }
}

class Point3D_1 extends Point_1{
    int z;
    Point3D_1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation(){
        return "x :"+ x + ", y : " + y +" , z :" + z;
    }
}