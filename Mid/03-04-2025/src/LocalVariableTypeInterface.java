//Topic => Local Variable Type Interface (var)

public class LocalVariableTypeInterface {
    // var i; // Wrong
    // var j = 10; // Wrong
    public static void main(String[] args) {
        // var i; // Wrong, need initializer
        var i = 10;
        System.out.println(i);

        for (var k = 0; k < 10; k++) {
            System.out.println(k);
        }

        var p = new TerneryOperator(); // Correct, non-primitive like string
    }
}