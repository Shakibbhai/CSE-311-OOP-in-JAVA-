package shakib_java_project_starting_file_how_to_learn;

import java.io.*;

public class write_on_file {
	public static void main(String[] args)throws IOException {
		
		FileWriter a=new FileWriter("D:\\New folder\\chaku.txt"); 
		//try {
			a.write("tai nki yo yo chiyo  ");
			a.write("shakasakdaldchk", 3, 6);
			a.close();
			
		//}//finally {
			
		//}
	System.out.println("succesfully wrote on file:......");
	}

}
