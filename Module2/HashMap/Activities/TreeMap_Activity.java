package Module2.HashMap.Activities;

import java.util.TreeMap;


public class TreeMap_Activity {
     private TreeMap<String, String> books = new TreeMap<>();

    public void addOrUpdateBook(String isbn, String title) {
        // Task1: add or update to the TreeMap
        books.put(isbn,title);
        System.out.println("Book with ISBN "+isbn+" has been added/ updated");
    }

    public void removeBook(String isbn) {
        // Task 2: check and remove only if present from the TreeMap, else print appropriate message
       String currBook = books.remove(isbn);
       if(currBook != null){
           System.out.println("Book with ISBN "+isbn+" has been removed.");
       }else{
           System.out.println("Book with ISBN "+isbn+" not found");
       }
    }

    public void getBookTitle(String isbn) {
        // Task 3: get from TreeMap and print appropriate message if not found
        boolean contains = books.containsKey(isbn);
        if(contains){
            System.out.println("ISBN "+isbn+": Effective Java");
        }else{
            System.out.println("ISBN "+isbn+": Not Found");

        }
    }

    public void displayAllBooks() {
        // Task 4: display all the elements in TreeMap
        if(books.isEmpty()){
            System.out.println("Empty book");
        }else{
            System.out.println("Book Inventory: "+books);
        }
    }

    public static void main(String[] args) {
        TreeMap_Activity inventory = new TreeMap_Activity();

        // Add or update books
        inventory.addOrUpdateBook("978-0134685991", "Effective Java");
        inventory.addOrUpdateBook("978-1491950357", "Clean Architecture");
        inventory.addOrUpdateBook("978-0132350884", "Clean Code");

        // Display all books
        inventory.displayAllBooks();

        // Retrieve the title of a specific book by ISBN
        inventory.getBookTitle("978-0134685991");

        // Remove a book
        inventory.removeBook("978-1491950357");

        // Display all books after removal
        inventory.displayAllBooks();
    }
}
