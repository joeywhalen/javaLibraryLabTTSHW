package javaLibraryLabTTSHW;

//import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
	// Add the missing implementation to this class
	//private static PrintStream printOpeningHours;
	private Object printAddress;
	private Object addBook;
	String libraryAddress;
	String anotherLibraryAddress;
	String book;
		
	ArrayList<Book> libraryMain; //= new ArrayList<String>();//ArrayList<String> firstLibrary = new ArrayList<String>();
	//ArrayList<String> libraryLiberty = new ArrayList<String>();//ArrayList<String> secondLibrary = new ArrayList<String>();  
	
	public Library(String anotherLibraryAddress) {
		// TODO Auto-generated constructor stub
    	this.libraryMain = new ArrayList<Book>();
    	this.libraryAddress = anotherLibraryAddress;
	}
	
    public boolean addBook(Book book) {
		// TODO Auto-generated method stub
    	return this.libraryMain.add(book);//addBook = libraryMain.add("The Da Vinci Code");//addBook = libraryMain.add(this.book);
	}
    
    public void contents () {
      for (int i = 0; i < libraryMain.size(); i++) {
      	System.out.println(libraryMain.get(i));
      }
      }
    
    private static void printOpeningHours() {
		// TODO Auto-generated method stub
    	System.out.printf("Libraries are open daily from 9am to 5pm.");//printOpeningHours = System.out.printf("Libraries are open daily from 9am to 5pm.");
	}
    
    private void printAddress() {
		// TODO Auto-generated method stub
    	System.out.println(this.libraryAddress);
	}
    
    private void borrowBook(String bookTitle) {
		// TODO Auto-generated method stub
		boolean found = false;
		boolean success = false;
		for (Book book : this.libraryMain) {
			if (book.title.equalsIgnoreCase(bookTitle)) {
				found = true;
				if (!book.isBorrowed()) {
					book.borrowed();
					System.out.println("You successfully borrowed " + bookTitle);
					success = true;
					break;
				}
			}
		}
		if (!found) {
			System.out.println("Sorry, this book is not inj our catalog.");
		} else if (!success) {
			System.out.println("Sorry, this book is already borrowed.");
		}
	}

	public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        
        //firstLibrary.contents();// remove this

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

//        // Print the titles of all available books from both libraries
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//        System.out.println();
//        System.out.println("Books available in the second library:");
//        secondLibrary.printAvailableBooks();
//        System.out.println();
//
//        // Return The Lords of the Rings to the first library
//        System.out.println("Returning The Lord of the Rings:");
//        firstLibrary.returnBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of available from the first library
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
  }

	

	

		
}
