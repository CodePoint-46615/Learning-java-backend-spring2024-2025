import java.util.*;

class Person {

    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




public class Main {
    public static void main(String[] args) {

        //List => ArrayList
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("one");
        arraylist.add("two");

        for(String s: arraylist) System.out.println(s);

        //List => LinkedList
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("one");
        linkedlist.add("two");

        for(String s: linkedlist) System.out.println(s);

        //List => PriorityQueue
        Queue<String> priorityqueue = new PriorityQueue<>();
        priorityqueue.add("one");
        priorityqueue.add("two");
        System.out.println(priorityqueue.peek());

        for(String s: priorityqueue) System.out.println(s);

        //Basic operation on ArrayList
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1, "xyz"));
        personList.add(new Person(2, "zyx"));

        for(Person p: personList) System.out.println(p.getName());
    }
}