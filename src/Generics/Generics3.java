package Generics;

import java.util.*;

class Prouduct{}
class Tv1 extends Prouduct{}
class Audio1 extends Prouduct{}

public class Generics3 {
    public static void main(String[] args) {
        ArrayList<Prouduct> proList = new ArrayList<Prouduct>();
        ArrayList<Tv1> tvList = new ArrayList<Tv1>();

        proList.add(new Tv1());
        proList.add(new Audio1());

        tvList.add(new Tv1());
        tvList.add(new Tv1());

        printAll(proList);

    }
    public static void printAll(ArrayList<Prouduct> list){ // new ArrayList<Tv>(); 이걸 넣으면 안댄다~
        for (Prouduct p : list)
            System.out.println(p);
    }
}


