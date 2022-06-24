package Polymorphism;

public class Parameter_Poly {
    public static void main(String[] args) {
        Buyer1 b1 = new Buyer1();

        Product1 p = new Tv1();
        b1.buy(p); // b1.buy(new Tv1()); 이거랑 같다.

        b1.buy(new Computer1());

        System.out.println("현재 남은 돈은 " + b1.money);
        System.out.println("보너스 포인트는 " + b1.bonusPoint);
    }
}

class Product1{
    int price;
    int bonusPoint;

    Product1(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product1{
    Tv1(){
        super(100);
    }
    public String toString() {return "Tv";}
}

class Computer1 extends Product1{
    Computer1(){
        super(200);
    }
    public String toString(){return "Computer";}
}



class Buyer1{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product1 p){
        if(money<p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+"을/를 구입하셨습니다.");
    }

}
