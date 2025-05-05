public class Audiobook {
    private String title;
    private int durationMinutes;

    public Audiobook(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String toString() {
        return "Audiobook [Title=" + title + ", Duration=" + durationMinutes + " mins]";
    }
}
