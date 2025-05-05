import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic {
    public static void main(String[] args) {

        //Example 1
        String[] names = new String[] {"abc", "xyz", "def", "mno"};
        var data = Stream.of(names);
        List<String> data2 = data.map(String::toUpperCase).collect(Collectors.toList());

        Integer[] nums = new Integer[] {1, 2, 3, 4, 5, 5, 5};
        Stream.of(nums).map(x -> x * 2)
                .filter(x -> x > 5)
                .distinct()
                .forEach(System.out::println);

        //Example 2
        Stream<Integer> numbers = Stream.of(10, 15, 7, 8, 100, 52);
        numbers.map(x -> x * 3)
                .peek(System.out::println)
                .filter(x -> x % 5 == 0)
                .peek(x -> System.out.println("Divisible by 5: " + x))
                .forEach(System.out::println);
    }
}