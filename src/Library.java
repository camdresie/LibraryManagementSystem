import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a library
 * @author camer
 *
 */
public class Library {
	
	//Instance Variables
	
	/**
	 * Represents a library holding book objects
	 */
	ArrayList<Book> library = new ArrayList<Book>();
	
	
	// Methods
	
	public void printInstructions() {
		System.out.println("Welcome to the library! If you would like to add a book, type 'add'. If you would like to remove a book, type 'remove'.");
		System.out.println("If you would like to see each book in the library, type 'print'. To exit the library, type 'exit'. Enjoy your reading!");
		System.out.println();
	}
	
	public void addBook(Scanner sc) {
		System.out.println("What is the title of the book you'd like to add?");
		String title = sc.nextLine();
		System.out.println("Who is the author of this book?");
		String author = sc.nextLine();
		Book book = new Book(title, author);
		this.library.add(book);
	}
	
	public void removeBook(Scanner sc) {
		System.out.println("What is the title of the book you'd like to remove?");
		String title = sc.nextLine();
		for (Book book : this.library) {
			if (book.title == title) {
				this.library.remove(book);
			}
		}
	}
	
	public void printBooks() {
		System.out.println("Here are the books in your library:");
		for (Book book : this.library) {
			System.out.println(book);
		}
	}
}
