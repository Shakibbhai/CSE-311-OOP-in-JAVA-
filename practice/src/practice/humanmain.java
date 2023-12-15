package practice;

public class humanmain {
	public static void main(String[] args) {
		human obj=new human("rinku",23,67.23);
		human obj1=new human("sakib",23,234.23);
		
		System.out.println(obj.name+"\n"+obj.age+"\n"+obj.weight);
		obj.eating();
		obj1.drinking();
		
	}

}
