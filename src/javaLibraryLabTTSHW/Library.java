package javaLibraryLabTTSHW;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
	// Add the missing implementation to this class
	private static PrintStream printOpeningHours;
	private Object printAddress;
	String libraryAddress;
	String anotherLibraryAddress;
	
	ArrayList<String> libraryMain = new ArrayList<String>();//ArrayList<String> firstLibrary = new ArrayList<String>();
	ArrayList<String> libraryLiberty = new ArrayList<String>();//ArrayList<String> secondLibrary = new ArrayList<String>();
	
	
    public Library(String anotherLibraryAddress) {
		// TODO Auto-generated constructor stub
    	this.libraryAddress = anotherLibraryAddress;
	}
    
    private void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}
    
    private static void printOpeningHours() {
		// TODO Auto-generated method stub
		printOpeningHours = System.out.printf("Libraries are open daily from 9am to 5pm.");
	}
    
    private void printAddress() {
		// TODO Auto-generated method stub
    	System.out.println(this.libraryAddress);
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

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
//        System.out.println("Borrowing The Lord of the Rings:");
//        firstLibrary.borrowBook("The Lord of the Rings");
//        firstLibrary.borrowBook("The Lord of the Rings");
//        secondLibrary.borrowBook("The Lord of the Rings");
//        System.out.println();
//
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
