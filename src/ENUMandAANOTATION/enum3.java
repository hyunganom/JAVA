package ENUMandAANOTATION;

public class enum3 {
}
//열거형에 멤버 추가하기
//-불연속적인 열거형 상수의 경우, 원하는 값읋 괄호()안에 적는다.
//      enum Direction {EAST(1),SOUTH(5), WEST(-1), NORTH(10)}
//-괄호()를 사용하려면, 인스턴스 변수와 생성자를 새로 추가해 줘야 한다.
enum Direction1{
    EAST(1),SOUTH(5), WEST(-1), NORTH(10); //끝에 ';'를 추가 해야한다.

    private  final  int value; // 정수를 저장할 필드(인스턴스 변수)를 추가

    Direction1(int value) { //생성자를 추가
        this.value = value;
    }
    public  int getValue(){
        return value;
    }
}
