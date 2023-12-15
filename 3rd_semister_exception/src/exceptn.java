
public class exceptn {
public static void main(String []args) {
	try {
	int []a=new int[4];
	 a[4]=2;
	//System.out.println("result is: "+a[4]);
	
}catch(ArrayIndexOutOfBoundsException e1) {
	System.out.println("exception is: "+e1);
}catch(Exception e2) {
	System.out.println("janina : "+e2);
}
	finally {
	System.out.println("the last line of the program ");
}
}}
