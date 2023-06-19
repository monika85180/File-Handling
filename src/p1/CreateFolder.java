package p1;

import java.io.File;

public class CreateFolder {
public static void main(String[] args) {
	File f = new File("C:\\Users\\rajpo\\Desktop\\file_handling");
	boolean val = f.mkdir();
	System.out.println(val);
	
	// getting the list of file and folders within given file
	String[] list = f.list();
	for(String l : list) {
		System.out.println(l);
	}
}
}
