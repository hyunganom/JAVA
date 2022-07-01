package CollectionFramework;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackAndQueue2 {
    public static void main(String[] args) {
//        if (args.length!=1){
//            System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
//            System.out.println("Example: java ExpValidCheck \"((2+3)*1)+3\"");
//            System.exit(0);
//        }

        Stack st = new Stack();
        String expression = "((2+3)*1)+3";

        System.out.println("expression:"+expression);

        try {
            for (int i=0; i < expression.length();i++){
                char ch = expression.charAt(i);

                if(ch=='('){
                    st.push(ch+"");
                }else if(ch==')') {
                    st.pop();
                }

            }
            if (st.isEmpty()){
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e){
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
//스택과 큐의 활용
//스택 활용의 예 : 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우저의 뒤로/앞으로
//큐 활용의 예 : 최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)