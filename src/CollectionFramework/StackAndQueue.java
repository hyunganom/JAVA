package CollectionFramework;

import java.util.*;

public class StackAndQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); //Queue인터페이스의 구현체인 LinkedList를 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while (!st.empty()){
            System.out.println(st.pop()); // pop(): 꺼내기
        }
        System.out.println("= Queue =");
        while (!q.isEmpty()){
            System.out.println(q.poll());   //poll() : 꺼내기
        }
    }
}
//스택과 큐
//스택:LIFO(Last in First Out)구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다.
//큐 :FIFO(First in First OUt)구조. 제일 먼저 저장한 거을 제일 먼저 꺼내게 된다.