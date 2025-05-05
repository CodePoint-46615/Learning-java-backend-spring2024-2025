//Topic: Varangs

public class VariableLengthArgument {
    public static void main(String... args) {
        for(String arg: args) {
            System.out.println(arg);
        }
        print("Welcome", 10, 20, 30);
        print("Greeting", "xyz", "zyx", "pqr", "...");
    }

    //Method overloading
    public static void print(String msg, int... ids) {
        for (int id: ids) {
            System.out.println(msg + " " + id);
        }
    }

    public static void print(String msg, String... names) {
        for (String name: names) {
            System.out.println(msg + " " + name);
        }
    }
}
