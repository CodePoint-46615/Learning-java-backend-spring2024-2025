class Ebook {
    private String title;
    private double fileSizeMB;

    public Ebook(String title, double fileSizeMB) {
        this.title = title;
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String toString() {
        return "Ebook [Title=" + title + ", File Size=" + fileSizeMB + " MB]";
    }
}
