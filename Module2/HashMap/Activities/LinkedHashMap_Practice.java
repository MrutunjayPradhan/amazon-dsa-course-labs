package Module2.HashMap.Activities;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Practice {
    private LinkedHashMap<String, String> borrowedBooks = new LinkedHashMap<>();

    public void borrowBook(String studentName, String bookTitle) {
        borrowedBooks.put(studentName, bookTitle);
        System.out.println(studentName+" borrowed "+bookTitle);
    }

    public void returnBook(String studentName) {
        String bookName = borrowedBooks.remove(studentName);
        if (bookName == null) {
            System.out.println("No book borrowed by " + studentName);
        } else {
            System.out.println(studentName + " Returned " + bookName);
        }
    }

    public void checkBorrowedBook(String studentName) {
        if (borrowedBooks.containsKey(studentName)) {
            System.out.println(studentName + " Borrowed " + borrowedBooks.get(studentName));
        } else {
            System.out.println(studentName + " Not borrowed any book");
        }
    }

    public void displayAllBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No data found");
        } else {
            System.out.println("Printing the borrowed list");
            for (Map.Entry<String, String> entry : borrowedBooks.entrySet()) {
                System.out.println(entry.getKey() + " borrowed " + entry.getValue());
            }
        }
    }

    public void borrowBookIfNotBorrowed(String bookTitle, String studentName) {
        // Check if student already has a book
        if (borrowedBooks.containsKey(studentName)) {
            System.out.println(studentName + " already borrowed " + borrowedBooks.get(studentName));
            return;
        }

        // Check if the book is already borrowed by someone else
        if (borrowedBooks.containsValue(bookTitle)) {
            System.out.println(bookTitle + " is already borrowed by someone else");
            return;
        }

        // If not, borrow the book
        borrowedBooks.put(studentName, bookTitle);
        System.out.println(studentName + " borrowed " + bookTitle);
    }

    public static void main(String[] args) {
        LinkedHashMap_Practice library = new LinkedHashMap_Practice();

        // Borrowing books
        library.borrowBook("Alice", "Java Programming");
        library.borrowBook("Bob", "Data Structures");

        // Display all borrowed books
        library.displayAllBorrowedBooks();

        // Check if Charlie has borrowed any books
        library.checkBorrowedBook("Charlie");

        // Borrow a book only if it's not already borrowed
        library.borrowBookIfNotBorrowed("Java Programming", "Charlie");

        // Borrow another book
        library.borrowBookIfNotBorrowed("Operating Systems", "Charlie");

        // Return a book
        library.returnBook("Alice");

        // Display all borrowed books after return
        library.displayAllBorrowedBooks();
    }
}