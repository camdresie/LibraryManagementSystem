import java.util.Random;

/**
 * Represents a single book
 * @author camer
 *
 */
public class Book {
	
	//Instance Variables
	
	/**
	 * Title of book
	 */
	String title;
	
	/**
	 * Author of Book
	 */
	String author;
	
	/**
	 * ISBN of book
	 */
	long isbn;
	
	/**
	 * Rating (out of 5 stars) of book
	 */
	int rating;
	
	/**
	 * The number of pages in the book
	 */
	int numPages;
	
	/**
	 * The year the book was published
	 */
	int year;
	
	//Constructor
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isbn = this.assignISBN();
		this.rating = this.assignRating();
		this.numPages = this.assignPages();
		this.year = this.assignYear();
	}
	
	
	// Methods
	
	/**
	 * Assigns a random long to be the ISBN of the given book
	 * @return
	 */
	public long assignISBN() {
		Random random = new Random();
		long isbn = random.nextLong();
		return isbn;
	}
	
	/**
	 * Returns a number from 0-5 representing the rating of the current book
	 * @return
	 */
	public int assignRating() {
		Random random = new Random();
		return random.nextInt(6);
	}
	
	/**
	 * Assigns a number of pages to the book
	 * @return
	 */
	public int assignPages() {
		Random random = new Random();
		return random.nextInt();
	}
	
	/**
	 * Assigns a year to the book 
	 * @return
	 */
	public int assignYear() {
		int year = (int) (Math.random() * 2020 + 1);
		return year;
	}
	
	/**
	 * Specifies that the title and author will be printed by overriding the toString method
	 */
	@Override
	public String toString() {
		return this.title + " by " + this.author;
	}

}
