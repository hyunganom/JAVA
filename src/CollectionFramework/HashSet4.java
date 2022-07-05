package CollectionFramework;

import java.util.HashSet;
import java.util.Objects;

public class HashSet4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");// 중복이라 저장안됨
        set.add(new Person("David",10));
        set.add(new Person("David",10));//근데 여기는 저장이 되네? ---equels랑 hashCode가 없어서 그럼


        System.out.println(set);
    }
}
//HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
//같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
//-boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
//equals()와 hashCode()가 오버라이딩 되어 있어야 함.

//equals 와 hashCode를 오버라이딩 해야 HashSet이 바르게 동작
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;

        Person p = (Person) o;
        //나자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age== p.age;
    }

    @Override
    public int hashCode() {
        //int hash(Objects... values); <-가변인자 안에 iv들 넣어주면 됨
        return Objects.hash(name, age);
    }
}