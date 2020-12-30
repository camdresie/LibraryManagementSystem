import java.util.Scanner;

public class LibraryManager {
	
	

	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		library.printInstructions();
		boolean looping = true;
		
		while(looping) {
			String command = sc.nextLine().toLowerCase();
			switch (command){
				case "add": library.addBook(sc);
							break;
				case "remove": library.removeBook(sc);
							   break;
				case "print": library.printBooks();
							  break;
				case "exit": looping = false;
							 break;
				default: System.out.println("That is not a valid command. Please try again.");
						 break;
			}
		}
		
		System.out.println("Thank you for using the library! Come again soon.");
		sc.close();
	}

}
