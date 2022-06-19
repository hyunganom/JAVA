package Polymorphism;

public class Note1 {
    public static void main(String[] args) {
//        Product123 p1 = new Tv123();
//        Product123 p2 = new Coputer123();
//        Product123 p3 = new Audio123();
        //이거를 배열로 이용해서
        Product123 p[] = new Product123[3];
        p[0] = new Tv123();
        p[1] = new Coputer123();
        p[2] = new Audio123();

    }
}

class Product123{}
class Tv123 extends Product123 {}
class Coputer123 extends Product123{}

class Audio123 extends Product123{}