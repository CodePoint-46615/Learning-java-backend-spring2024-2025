import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        // 1. Collection to Stream
        List<String> names = Arrays.asList("xyz", "mno", "abc");
        Stream<String> stream1 = names.stream();
        stream1.forEach(System.out::println);

        // 2. Array to Stream
        String[] names2 = new String[] {"pqr", "zyy", "bbb"};
        Stream<String> stream2 = Arrays.stream(names2);
        stream2.filter(x-> x.contains("p")).forEach(System.out::println);

        // 3. Stream of
        Stream<Integer> nums = Stream.of(2, 5, 1, 7, 9);
        nums.sorted().forEach(System.out::println);

        // 4. Empty
        Stream<Integer> empty = Stream.empty();
        long size = empty.count();
        System.out.println(size);

        // 5. Stream iterate
        Stream<Integer> random = Stream.iterate(1, n -> n + 1).limit(10);
        random.forEach(System.out::println);
    }
}
