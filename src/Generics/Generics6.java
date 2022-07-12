package Generics;
import java.util.*;

class Fruit implements Eatable{
    public String toString() {return "Fruit";}
}
class Apple extends Fruit{public String toString() {return "Apple";}}
class Grape extends Fruit{public String toString() {return "Grape";}}
class Toy                {public String toString() {return "Toy";}}

interface Eatable{}

public class Generics6 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//        FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Grape()); 에러 : Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }
}
class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item)    {list.add(item);}
    T get(int i)        {return list.get(i);}
    int size()          {return list.size();}
    public String toString(){return  list.toString();}
}
//제한된 지네릭 클래스
//-extends로 대입할 수 있는 타입을 제한
