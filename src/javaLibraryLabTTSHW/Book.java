package javaLibraryLabTTSHW;

import java.util.ArrayList;

public class Book {

	String title;// = ("The Da Vinci Code");
    boolean borrowed;
    boolean returned;
    public boolean addBook;
    //public String bookTitle;
    
    ArrayList<String> firstLibrary = new ArrayList<String>();
    	
    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
    	title = "The Da Vinci Code";
    	//bookTitle = title;
    	firstLibrary.add(title);//firstLibrary.add(bookTitle);//firstLibrary.add("The Da Vinci Code");
    	//return;
    	//bookTitle = "The Da Vinci Code";//bookTitle = title;
    }
    
//    public void addBook() {
//    	addBook = firstLibrary.add("The Da Vinci Code");
//    }
    
    public void contents () {
    for (int i = 0; i < firstLibrary.size(); i++) {
    	System.out.println(firstLibrary.get(i));
    }
    }
    
    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    	borrowed = firstLibrary.remove("The Da Vinci Code");
    }
   
    // Marks the book as not rented
    public void returned() {
        // Implement this method
    	returned = firstLibrary.add("The Da Vinci Code");
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
    	boolean isBorrowed = firstLibrary.isEmpty();//boolean isBorrowed = firstLibrary.contains("The Da Vinci Code");
			return true;
        // Implement this method
    }
   
    // Returns the title of the book
    public String getTitle() {
    	//String getTitle = "";
    	String getTitle = title;//String getTitle = bookTitle;//getTitle = "Test";//getTitle = bookTitle;//getTitle = firstLibrary.get(0);
		return getTitle;
        // Implement this method
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();//example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.contents();
    }
}
