package Generics;
import java.util.*;

class Fruit1{public String toString() {return "Fruit";}}
class Apple1 extends Fruit1 {public String toString() {return "Apple";}}
class Grape1 extends Fruit1{public String toString() {return "Grape";}}

class Juice{
    String name;

    public Juice(String name) {
        this.name = name +"Juice";
    }
    public String toString() {return name;}
}

class Juicer{
    static Juice makeJuice(FruitBox1<? extends Fruit1> box1){
        String tmp = "";

        for (Fruit1 f : box1.getList())
            tmp+=f+" ";
        return new Juice(tmp);
    }
}

public class Generics7 {
    public static void main(String[] args) {
        FruitBox1<Fruit1> fruitBox = new FruitBox1<Fruit1>();
        FruitBox1<Apple1> appleBox = new FruitBox1<Apple1>();

        fruitBox.add(new Apple1());
        fruitBox.add(new Grape1());
        appleBox.add(new Apple1());
        appleBox.add(new Apple1());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox1<T extends Fruit1> extends Box1<T>{}
class Box1<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){list.add(item);}
    T get(int i){return list.get(i);}
    ArrayList<T> getList(){return list;}
    int size(){return  list.size();}
    public String toString(){return list.toString();}
}
//와일드카드 <?>
//-하나의 참조변수로 대입된 타입이 다른 객체를 참조 가능
//ArrayList<? extends Product> list = new ArrayList<Tv>(); //ok
//ArrayList<? extends Product> list = new ArrayList<Audio>(); //ok

//<? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
//<? super T> 와일드 카드의 하한 제한. T와 그 자손들만 가능


