package Exception_Handling;

import java.io.*;

public class Method_Exception {
    public static void main(String[] args) {
            try {
                File f = createFile("");
                System.out.println(f.getName()+"파일이 성공적으로 생성되있습니다.");
            }catch (Exception e){
                System.out.println(e.getMessage()+"다시 입력해 주시기 바랍니다.");
            }
        }//main메서드 끝

    static File createFile(String fileName) throws Exception {
        if (fileName==null || fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않습니다.");
        File f = new File(fileName);        //File클래스의 객체를 만든다.
        f.createNewFile();
        return  f;                         //생성된 객체의 참조를 반환한다.
    }
}
//메서드에 예외 선언하기
//예외를 처리하는 방법 : try-catch문(직접처리), 예외 선언하기(예외 떠넘기기)
//메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것.
