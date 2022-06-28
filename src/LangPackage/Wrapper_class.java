package LangPackage;

public class Wrapper_class {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? "+(i==i2));
        System.out.println("i.equals(i2) ? "+i.equals(i2));
        System.out.println("i.compareTo(i2) ? "+i.compareTo(i2));
        System.out.println("i.toString(i2) ? "+i.toString(i2));
    }
}
//래퍼(wrapper)클래스 : 기본형을 감싸는 클래스
//-8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스

