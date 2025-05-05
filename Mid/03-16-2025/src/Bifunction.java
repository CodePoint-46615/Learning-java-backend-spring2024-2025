import java.util.function.*;

public class Bifunction {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> multiply = (num1, num2) -> num1 * num2;
        BiFunction<Integer, Integer, Integer> add = (num1, num2) -> num1 + num2;

        // Using andThen is not directly possible with BiFunction, but you can chain manually
        System.out.println(multiply.andThen(result -> add.apply(result, 50)).apply(10, 5));
    }
}