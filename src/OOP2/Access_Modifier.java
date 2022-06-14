package OOP2;

public class Access_Modifier {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv); //에러
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);

    }
}
//접근제어자
//private : 같은 클래스 내에서만 접근이 가능하다
//protect : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
//public : 접근 제한이 전혀 없다.

class MyParent {
    private int prv;        //같은 클래스
    int dft;                //같은 패키지
    protected int prt;      //같은 패키지 + 자손(다른 패키지)
    public int pub;         //접근제한

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}



