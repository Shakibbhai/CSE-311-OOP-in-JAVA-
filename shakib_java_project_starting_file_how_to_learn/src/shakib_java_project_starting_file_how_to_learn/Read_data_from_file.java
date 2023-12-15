package shakib_java_project_starting_file_how_to_learn;

import java.io.FileReader;
import java.io.IOException;

public class Read_data_from_file {
	public static void main(String[] args)throws IOException {
		FileReader a =new FileReader("D:\\New folder\\chau.txt");
		int i;
		while((i=a.read())!=-1) {
			System.out.print((char)i);
		}
		a.close();
	}

}
