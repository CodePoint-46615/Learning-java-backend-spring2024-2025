import java.util.Random;
import java.util.stream.IntStream;

public class OddNumbersStream {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream.generate(() -> random.nextInt(100) + 1) // Generate numbers between 1 and 100
                .limit(10)                              // Limit to 10 numbers
                .filter(num -> num % 2 != 0)                // Filter odd numbers
                .forEach(System.out::println);                 // Print odd numbers
    }
}
