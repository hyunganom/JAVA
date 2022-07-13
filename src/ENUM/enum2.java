package ENUM;

public class enum2 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class,"EAST");

        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);

        System.out.println("d1 == d2 ?"+(d1==d2));
        System.out.println("d1 == d3 ?"+(d1==d3));
        System.out.println("d1.equals(d3) ? "+d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? "+d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) ? "+d1.compareTo(d2));

        switch (d1){
            case EAST:      //Direction.EAST라고 쓸수없다.
                System.out.println("The Direction is EAST."); break;
            case SOUTH:      //Direction.EAST라고 쓸수없다.
                System.out.println("The Direction is SOUTH."); break;
            case WEST:      //Direction.EAST라고 쓸수없다.
                System.out.println("The Direction is WEST."); break;
            case NORTH:      //Direction.EAST라고 쓸수없다.
                System.out.println("The Direction is NORTH."); break;
            default:
                System.out.println("Invalid direction."); break;
        }
        Direction[] dArr = Direction.values(); // values는 열거형의 모든 상수를 배열에 담아 반환한다.
        for (Direction d : dArr) //for(Direction d : Direction.values())
            System.out.printf("%s = %d%n", d.name(),d.ordinal());

    }
}
enum Direction {EAST,SOUTH, WEST, NORTH}