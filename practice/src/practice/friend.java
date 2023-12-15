package practice;

public class friend {
	
	String name;
	static int numoffriends;
	
    friend(String name){
		this.name=name;
		numoffriends++;
	}
	
	static void displayfrnd() {
      System.out.println("you have "+numoffriends+" friends");
      
	}
	
	

}
