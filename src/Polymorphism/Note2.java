package Polymorphism;

public class Note2 {
    public static void main(String[] args) {
        Tank_1 tank = new Tank_1();
        DropShip_1 dropShip = new DropShip_1();

        Marine_1 marine = new Marine_1();
        SCV scv = new SCV();

        scv.repairble(tank);

    }
}

interface Repairble{}

class Unit_1{
    int hitPoint;
    final int MAX_HP;

    public Unit_1(int hp) {
        this.MAX_HP = hp;
    }
}

class GroundUnit_1 extends Unit_1{
    public GroundUnit_1(int hp) {
        super(hp);
    }
}
class AirUnit_1 extends Unit_1{
    public AirUnit_1(int hp) {
        super(hp);
    }
}

class Tank_1 extends Unit_1 implements Repairble{
    public Tank_1() {
        super(150);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
class DropShip_1 extends AirUnit_1 implements Repairble{
    public DropShip_1() {
        super(125);
        hitPoint = MAX_HP;
    }
    @Override
    public String toString() {
        return "DropShip";
    }
}

class Marine_1 extends GroundUnit_1{
    public Marine_1() {
        super(40);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Marine";
    }
}

class SCV extends GroundUnit_1 implements Repairble{
    public SCV() {
        super(60);
        hitPoint = MAX_HP;
    }
    public void repairble(Repairble r){
        if (r instanceof Unit_1){
            Unit_1 u = (Unit_1)r;
            while (u.hitPoint!=u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString()+"수리가 끝났습니다.");
        }
    }
}

