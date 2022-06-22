package Exception_Handling;

public class Try_Catch {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4); //여기서 4가 실행되지 않는다-> 바로 try-catch로 넘어감
        }catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
        }catch (Exception e){
            System.out.println("Exception");
        }// try-catch의 끝
        System.out.println(6);

    }//main메서드의 끝
}
