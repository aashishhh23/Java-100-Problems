// Create a Book class for a Library System
//     Instance Variable : title, author, isbn
//     Static variable : totalBooks, a counter for the total number of book instances
//     Instance Methods : borrowBook(), returnBook().
//     Static Method  : getTotalBooks(), to get the total number of books in the library.

// 1] Blocks  2] Constructor 3] Method

// 1] Static Variables 2] Non Static variables 3]Static Block 4] Normal Block 5] Constructors 6] Methods

class Book {

    static int totalNoOfBooks; // Static variables

    // Non static Variables
    String author;

    String title;

    String isbn;

    boolean isBorrowed;

    // initialize islea static blocks

    static {
        totalNoOfBooks = 0;
    }

    // Object init
    {
        totalNoOfBooks++;
    }

    // Constructor

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }

    // Another constructor
     Book(String isbn) {
        this(isbn, "Unknown","Unknown");
     }

     static int getTotalNoOfBooks() {
        return totalNoOfBooks;
     }

     void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy" + this.title);
        }


     }

     void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");

        }else {
            System.out.println("This book is already in the library");
        }
     }

    public static void main(String[] args) {
        Book designOfThings = new Book("1","Design","Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();

    }

}
