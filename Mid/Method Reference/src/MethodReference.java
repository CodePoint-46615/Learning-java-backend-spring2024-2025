//Method Reference example static, non-static, constructor
import java.util.function.Consumer;
import java.util.function.Function;


class Person {
    String name;

    /*Person(String n) {
        name = n;
    }*/

    Person() {
        System.out.println("Default Constructor of Person");
    }

    Person(int i) {
        System.out.println("Parameterized Constructor of Person (int)");
    }

    void show() {
        System.out.println(name);
    }
}

class Utility {

    static void toUpperCase(String val) {
        System.out.println(val.toUpperCase());
    }

    void toLowerCase(String val) {
        System.out.println(val.toLowerCase());
    }
}
public class MethodReference {
    public static void main(String[] args) {
        //Consumer<String> upper1 = (String s) -> System.out.println(s.toUpperCase()); //using lambda expression
        Consumer<String> upper2 = Utility::toUpperCase; //using method reference
        upper2.accept("SAIKOT");

        Utility u = new Utility();
        //Consumer<String> lower1 = (String s) -> System.out.println(s.toLowerCase()); //using lambda expression
        Consumer<String> lower2 = u::toLowerCase;   //using method reference
        lower2.accept("Kawsur");

        //Function<String, Person> f1 = (String name) -> new Person(name); //using lanbda expression
        //Function<Integer, Person> f2 = Person::new; //using method reference

        Function<Integer, Person> f3 = (Integer i) -> new Person(i);
        f3.apply(10);
    }
}
