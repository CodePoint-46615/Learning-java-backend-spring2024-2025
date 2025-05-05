import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 5. Generic Media Class with Nested Class
class Media<T> {
    List<T> items = new ArrayList<>();

    void addItems(T... elements) { // Variable-length arguments
        Collections.addAll(items, elements);
    }

    void displayItems() {
        for (var item : items) {
            System.out.println(item);
        }
    }

    // Nested Class
    class MediaInfo {
        void printInfo() {
            System.out.println("Total items in media: " + items.size());
        }
    }
}
