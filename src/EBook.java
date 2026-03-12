public class EBook extends Book {

    private double fileSize;

    // TODO: Implement constructor using super()
    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "[E-Book] " + super.toString() + ", File Size: " + fileSize + "MB";
    }
}
