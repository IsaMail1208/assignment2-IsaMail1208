import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter title: ");
                    String eTitle = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String eAuthor = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int eYear = scanner.nextInt();

                    System.out.print("Enter file size (MB): ");
                    double fileSize = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    EBook eBook = new EBook(eTitle, eAuthor, eYear, fileSize);
                    library.addBook(eBook);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();

                    Book found = library.searchByTitle(searchTitle);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;

                case 6:
                    System.out.print("Enter title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
