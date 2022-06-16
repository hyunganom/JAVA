package Polymorphism;

public class Parametrer_poly_Array {
    public static void main(String[] args) {
        Buyer b = new Buyer();

//        Product p = new Tv();
//        b.buy(p); 이 두줄을 간단하게 나타내면 밑에랑 같다.

        b.buy(new Tv());        // buy(product p)
        b.buy(new Computer());  // buy(product p)
        b.buy(new Audio());     // buy(product p)
        b.summary();
    }
}
//매개변수의 다형성
//참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
//장점 1. 다형적 매개변수  2.하나의 배열로 객체다루기

class Product{
    int price;      //제품가격
    int bounsPoint; //보너스 점수

    public Product(int price) {
        this.price = price;
        bounsPoint = (int)(price/10.0);
    }
    public Product() {//기본생성자
    }
}

class Tv extends Product{
    //조상클래스의 생성자 product(int pride)를 호출한다.
    public Tv() { super(100);}
    //object 클래스의 toString()을 오버라이딩 한다.
    public String toString(){return "Tv";}
}
class  Computer extends Product{
    public Computer() { super(200);}
    public String toString(){return "Computer";}
}
class  Audio extends  Product{
    public Audio() { super(50);}
    public String toString(){return "Audio";}
}

class Buyer{
    int money=1000;
    int bonusPoint=0;
    Product[] item = new Product[10];   //구입한 제품들 저장하기 위한 배열
    int i = 0;                          //product배열에 사용될 카운터

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;               //가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint = p.bounsPoint;      //제품의 보너스 점수를 추가한다.
        item[i++] = p;                  //제품을 product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다."); //p.toString() 과 같다

    }

    void summary(){
        int sum =0;                     //구입한 물품의 가격합계
        int sum2 = 0;
        String itemList = "";           //구입한 물품목록

        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i=0;i< item.length;i++){
            if(item[i]==null) break;
            sum += item[i].price;
            sum2 += item[i].bounsPoint;
            itemList += item[i].toString()+" , ";
        }
        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"입니다.");
        System.out.println("총 보너스 포인트는"+sum2);
        System.out.println("남은돈은 "+money);
    }

}















