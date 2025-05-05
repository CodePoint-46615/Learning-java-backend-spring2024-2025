import java.util.function.Consumer;
import java.util.function.Function;

public class AnonymousClasstoLambda {
    public static void main(String[] args) {

        //Example 1

        //Anonymous Class
        /*Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello, " + s);
            }
        };*/

        //Anonymous class to Lambda Expression
        Consumer<String> consumer = (s) -> System.out.println("Hello, " + s);
        consumer.accept("World");

        //Example - 2

        //Anonymous class
        /*Function<Integer, Integer> multiply =new Function<Integer, Integer>() {
            public Integer apply(Integer x) {
                return x*x;
            }
        };*/

        //Anonymous class to Lambda Expression
        Function<Integer, Integer> multiply =(Integer num1) -> num1*num1; //lamda expression
        Function<Integer, Integer> add =(Integer num1) ->num1 + 50;
        System.out.println(multiply.andThen(add).apply(10));
    }
}
