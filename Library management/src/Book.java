
public class Book {
	private String Title;
	private String Author;
	private String ISBN;
	private int numCopies;
	
	Book(){}
		
	Book(String title, String author, String ISBN, int numCopies){
		this.Title = title;
		this.Author = author;
		this.ISBN = ISBN;
		this.numCopies = numCopies;
	}

	void borrow() {
		numCopies = numCopies - 1;
	}
	
	void returnBook() {
		numCopies++;
	}
	
	public String getTitle() {
		return Title;
	}
	void display() {
		System.out.println("Book name: " + Title + "\n" + "the writer:" + Author + "\n" + "ISBN :" + ISBN + "\n" + "copies :" + numCopies);		 
	}
	

}
