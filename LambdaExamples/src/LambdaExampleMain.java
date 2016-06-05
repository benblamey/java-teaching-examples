import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class LambdaExampleMain {

	static class Book {
		public String Title;
		public String Author;
		public Date Published;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> books = new ArrayList<Book>();
		books.add(new Book() { {Title = "foo"; Author = "bob"; Published = new Date(2011); } } );
		books.add(new Book() { {Title = "bar"; Author = "alice"; Published = new Date(2009); } } );
		books.add(new Book() { {Title = "wibble"; Author = "charlie"; Published = new Date(1987); } } );
		
		System.out.println("Original Books:");
		printBooks(books);
		
		System.out.println("Sorted by Author:");
		Collections.sort(books, (b1, b2) -> b1.Author.compareTo(b2.Author));
		printBooks(books);
		
		System.out.println("Sorted by Title:");
		Collections.sort(books, (b1, b2) -> b1.Published.compareTo(b2.Published));
		printBooks(books);
	}

	private static void printBooks(List<Book> books) {
		for (Book book : books) {
			System.out.println("\t" + book.Title + "\tby " + book.Author + ",\ton: " + book.Published );
		}
	}

}
