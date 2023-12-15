
public class mainfunction {
public static void main(String[] args) {

		
		Book b0 = new Book("Java","herbert schilt","1",20);
		Book b1 = new Book("Statistics", "sheldon m.ross","2",20);
		Book b2 = new Book("teach your self c" , "herbert schilt","3",20);
		Book b3 = new Book("Calculus","howard antone","4",20);
		Book b4 = new Book("Bangladesh Global Studies","munna","4",20);
		
		Student s0 = new Student("Nazmus Shakib",1452);
		Student s1 = new Student("Imtiaz Kabir",1472);
		Student s2 =new Student("Rahul Sheikh",1400);
		Library ob = new Library(80,80);
		System.out.println("-------------Books are in the library------------------:");
		ob.addBook(b0);
		ob.addBook(b1);
		ob.addBook(b2);
		ob.addBook(b3);
		ob.addBook(b4);
		ob.displayBooks();
		System.out.println("");
		
		System.out.println("--------------borrowed books by the student name------------:");
		ob.addStudent(s0);
		ob.addStudent(s1);
		ob.addStudent(s2);
		ob.displayStudents();
		System.out.println("");
		
		System.out.println("---------------- Finding books 'Statistics'-------------------");
		Book temp = ob.findBook("Statistics");
		temp.display();
		System.out.println("");
		System.out.println("---------------------- Borrowbooks-----------------------------");
		ob.borrowBook("Java", s1);
		ob.borrowBook("Calculus", s1);
		System.out.println("\n");
		ob.borrowBook("Statistics", s0);
		ob.borrowBook("Java", s2);
		
		System.out.println("------------------------copy decreases----------------------");
		b0.display();
		b1.display();
		System.out.println("\n\n");
		
		System.out.println("----------------------student identity who borrowed-------------");
		s1.display();
		s0.display();
		s2.display();
		System.out.println("\n\n");
		
		System.out.println("-------------------------Returning book process-------------------");
		ob.returnBook("Java",s1);
		System.out.println("Borrowed books decreases:");
		s1.display();
		System.out.println("\n\n");
		
		System.out.println("books again increases in the library:\n");
		System.out.println("---------------return book is:-----------------------------------\n");
		b0.display();
		

	}
}	
	