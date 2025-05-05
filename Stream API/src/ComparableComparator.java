//Comparable Vs Comparator

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream;


class Person /*implements Comparable<Person>*/ {
    int id;
    int age;

    public Person(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ id=" + id +
                ", age=" + age + " }";
    }

    /*@Override
    public int compareTo(Person o) {
        return this.age - o.age;
        return o.age - this.age;
    }*/
}

/*
class CompareByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
*/

public class ComparableComparator {
    public static void main(String[] args) {
       /* CompareByAge c = new CompareByAge();*/
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, 50));
        people.add(new Person(2, 70));
        people.add(new Person(3, 25));
        people.add(new Person(4, 45));
        people.add(new Person(5, 60));
        people.stream()
                .sorted(Comparator.comparingInt(x -> x.age))
                .forEach(System.out::println);
    }
}



