package practice;
import java.util.*;

public class staticthins {
	public static void main(String []args) {
	String a="shakib,";
	StringBuilder b=new StringBuilder();
	for(char c:a.toCharArray()) {
		b.insert(0,c);
	}
	String d=b.toString();
	System.out.println(d);
}
}
