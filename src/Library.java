public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        // According to the assignment, the array capacity should be 10
        // regardless of the parameter value.
        books = new Book[10];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[count] = book;
        count++;
        System.out.println("Book added successfully.");
    }

    // TODO: Display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        if (title == null) {
            return null;
        }

        for (int i = 0; i < count; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                return books[i];
            }
        }

        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book book = searchByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            book.borrowBook();
            System.out.println("You borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book book = searchByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isAvailable()) {
            book.returnBook();
            System.out.println("You returned: " + book.getTitle());
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
}
