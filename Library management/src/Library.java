import java.util.ArrayList;
import java.util.Arrays;
public class Library {

	 Book []books ;
	 Student []students;
	 int numStudents = 0;
	 int numBooks = 0;
	 Library(int max_books , int max_students){
			this.books = new Book[max_books];
			this.students = new Student[max_students];
   }	

	public void addBook(Book book) {
		books[this.numBooks] = book;
		numBooks++;	
	}
	
	public void addStudent(Student student) {
		students[this.numStudents] = student;
		numStudents++;
	}
	
	public void displayBooks() {
		for(int q = 0 ; q < numBooks ; q++) {
			int temp = q+1;
			System.out.println(temp + ") "+books[q].getTitle()+"\n");
		}
	}
	public void displayStudents() {
		for(int q = 0 ; q < numStudents ; q++) {
			int temp = q+1;
			System.out.println(temp + ") "+students[q].getName()+"\n");
		}
	}
	Book findBook(String title) {
		for(int q = 0 ; q < numBooks  ; q++) {
			if(title == books[q].getTitle()) {				
				return books[q];
			}
		}
		
		Book book = new Book();		
		return book;	
	}
	
	void borrowBook(String title, Student student) {
		Book temp;
		temp = findBook(title);
		if(temp != null)
			addStudent(student);
		student.borrowBook(temp);
	}
	void returnBook(String title, Student student) {
		Book temp;
		temp = findBook(title);
		if(temp != null) {
			ArrayList<Student> arrayList = new ArrayList<>(Arrays.asList(students));
			for(int i = 0 ; i < numStudents ; i++) {
				if(students[i].getID() == student.getID()) {
					students[i] = student;
					arrayList.remove(student);
					students = arrayList.toArray(new Student[0]);
					numStudents--;
					break;
				}
			}
		}
		student.returnBook(temp);
	}	
	Book[] getBooks() {
		return books;
	}
	
}
