package LangPackage;

import java.util.Objects;

public class equals1 {
    public static void main(String[] args) {
        Person p1 = new Person(920504);
        Person p2 = new Person(920504);

        if(p1.equals(p2)) System.out.println("같은사람입니다.");
        else System.out.println("다른사람입니다.");

    }
}
class Person{
    long id;

    public Person(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //여기서 object 클래스의 리모콘은 id를 가리킬 수 없으니깐 형변환을 해줘야한다.
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
