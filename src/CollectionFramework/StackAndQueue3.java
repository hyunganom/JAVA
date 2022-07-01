package CollectionFramework;

import java.util.*;


public class StackAndQueue3 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.println(">>");
            try {
                //화면으로부터 라인단위로 입력을 받는다.
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim(); // trim() : 문자열 공백제거

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0); // 프로그램 종료
                } else if (input.equalsIgnoreCase("help")) { // equalsIgnoreCase() : 대소문자 구분안하는거
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    //입력받은 명령어를 저장하고,
                    save(input);

                    //LinkedList 내용을 보여준다.
                    LinkedList list = (LinkedList) q;

                    final int SIZE = list.size(); // 밑에 for문에다가 size()를 넣으면 반복문 돌때마다 호출을 해야해서 별로 좋지 못하다.
                    for (int i=0; i<SIZE;i++)
                        System.out.println((i+1)+"."+list.get(i));

                } else {
                    save(input);
                    System.out.println(input);
                } //if(input.equalsIgnoreCase("q"))

            } catch (Exception e) {
                System.out.println("입력오류 입니다.");
            }
        }
    }

    public static void save(String input) {
        //queue에 저장한다
        if (!"".equals(input)) {//if(!input.equals(""))
            q.offer(input); // 큐에 명령어 저장
        }

        //queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
        if (q.size() > MAX_SIZE) // size()는 Collection인터페이스의 정의
            q.remove();
    }
}
