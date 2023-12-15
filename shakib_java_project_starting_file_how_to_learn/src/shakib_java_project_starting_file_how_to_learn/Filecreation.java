package shakib_java_project_starting_file_how_to_learn;
import java.io.*;

public class Filecreation {
	public static void main(String[] args) {
		File f=new File("D:\\New folder\\chaku.txt");
		try {
		if(f.createNewFile()) {
			System.out.println("file successfully creation.....");
		}else {
			System.out.println("file already exists:...");
		}
		}catch(IOException a){
			System.out.println("exception is:-"+a);
		}
	}

}
