// 4. Book Class
class Book {
    String title;
    String author;
    Genre genre;
    double price;

    Book(String title, String author, Genre genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " | Genre: " + genre +
                " | Price: " + price +
                " | Expensive: " + (price > 500 ? "Yes" : "No"); // ternary operator
    }
}