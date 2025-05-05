import java.util.*;
import java.util.function.*;
import java.util.stream.*;



// 2. Custom Annotation
@interface Important {
    String message() default "This method is important";
}

// 3. Functional Interface
@FunctionalInterface
interface BookFilter {
    boolean filter(Book book);
}

// 6. Main Class with Higher Order Function
public class LibrarySystem {

    // Higher order function that applies discount strategy
    static void applyDiscount(List<Book> books, Function<Book, Book> discountFunc) {
        books.replaceAll(discountFunc::apply); // method reference
    }

    @Important(message = "Main method to run the system")
    public static void main(String[] args) {
        var book1 = new Book("1984", "George Orwell", Genre.FICTION, 450);
        var book2 = new Book("Sapiens", "Yuval Noah Harari", Genre.NONFICTION, 650);
        var book3 = new Book("Dune", "Frank Herbert", Genre.SCIFI, 800);

        var media = new Media<Book>();
        media.addItems(book1, book2, book3); // varargs
        media.displayItems();

        var info = media.new MediaInfo();
        info.printInfo();

        // Lambda: Filter expensive books
        BookFilter expensiveFilter = book -> book.price > 500;
        var filteredBooks = media.items.stream()
                .filter(expensiveFilter::filter)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Expensive Books:");
        filteredBooks.forEach(System.out::println); // Method reference

        // Sort using Stream
        System.out.println("\nSorted by Price:");
        media.items.stream()
                .sorted(Comparator.comparingDouble(b -> b.price))
                .forEach(System.out::println);

        // Apply 10% discount using Higher-Order Function
        applyDiscount(media.items, book -> new Book(
                book.title, book.author, book.genre, book.price * 0.9
        ));

        System.out.println("\nAfter Discount:");
        media.displayItems();
    }
}
