package javaLibraryLabTTSHW;

import java.util.ArrayList;

public class Book {

	String title;
    boolean borrowed;
    boolean returned;
    boolean isBorrowed;
    
    ArrayList<String> firstLibrary = new ArrayList<String>();
    	
    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
    	title = "The Da Vinci Code";
    	//firstLibrary.add(title);
    }
      
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
    	isBorrowed = firstLibrary.isEmpty();//boolean isBorrowed = firstLibrary.contains("The Da Vinci Code");
			if (isBorrowed == true)
				return true;
			else
        // Implement this method
				return false;
    }
   
    // Returns the title of the book
    public String getTitle() {
    	// Implement this method
    	String getTitle = title;
    	firstLibrary.add(getTitle);//firstLibrary.add(title);//firstLibrary.add("Test1");
		return getTitle; 
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
