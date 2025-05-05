//Functional Interface

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        //1. Consumer
        //Consumer<String> consumer = (String val) -> System.out.println(val);; //using lambda expression
        Consumer<String> consumer = System.out::println; //using method reference
        consumer.accept("My Message");

        //2.Predicate
        Predicate<Integer> isEven = (Integer i) -> i % 2 == 0;
        System.out.println(isEven.test(12));
        System.out.println(isEven.test(11));

        //3.Supplier
        //Supplier<String> supplier = () -> String.valueOf(new Random().nextInt(100)); // print single string
        Supplier<List<String>> supplier = () -> Collections.singletonList(String.valueOf(new Random().nextInt(100))); //print as array


        //Supplier<List<String>>  supplier = () -> Arrays.asList("xyz", "abc", "def"); //print as array
        System.out.println(supplier.get());

        //List<String> names = supplier.get();
        //names.forEach(System.out::println); // print single string

        //4.Function
        Function<Integer, Integer> multiply = (Integer num1) -> num1*num1;
        Function<Integer, Integer> add = (Integer num1)-> num1+50;
        System.out.println(multiply.andThen(add).apply(10));
    }
}