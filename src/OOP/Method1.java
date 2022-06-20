package OOP;

public class Method1 {

    //메서드란? 문장들을 묶어 놓은 것 {}<<여기 안에
    //하나의 작업을 {}안에 집어 넣은 것들을 메서드라고 한다.
    //예를들어 배열 출력이 여러번 반복쓰지말고 하나의 메서드를 사용해서 호출
    //메서드의 장점 : 중복코드 제거, 관리 용이, 재사용가능

    //메서드 = 선언부 + 구현부

    //		반환타입 메서드이름(타입변수명, 타입변수명.....)
//          {
//              메서드 호출시 수행될 코드
//          }
    static int add(int a, int b) {
        int result = a + b;
        return result; //호출한 메서드로 결과를 반환한다.
        //반환타입에 반환할 타입이 없으면 void라고 적는다.
    }

    public static void main(String[] args) {
        int[] numArr = new int[10];
        for (int i=0;i<10;i++){
            numArr[i] = (int)(Math.random()*10);
        }

        printArr(numArr);
        System.out.println();

        System.out.println(add(3, 5));
    }
    static void printArr(int[] numArr){
        for(int i=0;i<10;i++){
            System.out.printf("%d",numArr[i]);
            System.out.print(" ");
        }
    }
}

