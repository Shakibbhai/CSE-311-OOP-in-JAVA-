package shakib_java_project_starting_file_how_to_learn;

import java.io.File;

public class FILEinformation {
	public static void main(String[] args) {
		File g=new File("D:\\New folder\\Shakibbhai.txt");
		if(g.exists()) {
			System.out.println("FILE NAME:"+g.getName());
			System.out.println("file path:"+g.getAbsolutePath());
			//System.out.println("canonical path:"+g.getCanonicalPath());
			System.out.println("length is: "+g.length());
			System.out.println(" "+g.canRead());
			System.out.println(" "+g.canWrite());
			System.out.println(" "+g.delete());
			System.out.println("");
			System.out.println("");
		}else {
			System.out.println("file doesnt exist.");
		}
	}

}
