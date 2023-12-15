import java.util.ArrayList;
import java.util.Arrays;
public class Student {
	private String name;
	private int ID;
	private Book[] borrowedBooks = new Book[100];
	private int num_borrow = 0; 
	
	Student(String name, int ID){
		this.name = name;
		this.ID = ID;
	}
	
	void display() {
		System.out.println("Student's name: " + name + "\n" + "Student's ID: " + ID + "\n" );
		System.out.println("Borrowed books:");
		for(int i = 0 ; i < num_borrow ; i++) {
			int temp = i + 1;
			System.out.println(temp + ") " + borrowedBooks[i].getTitle());
		}
	}
	
	void borrowBook(Book book) {
		borrowedBooks[this.num_borrow] = book;
		if(book != null) {
			book.borrow();
		}
		else 
			System.out.println("No more books left!");
		num_borrow++;
	}
	
	void returnBook(Book book) {
		if(book == null) {
			System.out.println("there is no such book in the library.");
			return;
		}
		ArrayList<Book> arrayList = new ArrayList<>(Arrays.asList(borrowedBooks));
		for(int i = 0 ; i < num_borrow ; i++) {
			if(book.getTitle() == borrowedBooks[i].getTitle()) {
				book = borrowedBooks[i];
				arrayList.remove(book);
				num_borrow--;
				break;
			}
		}
		book.returnBook();
		borrowedBooks = arrayList.toArray(new Book[0]);
	}
	
	String getName() {
		return name;
	}
	
	int getID() {
		return ID;
	}
}
