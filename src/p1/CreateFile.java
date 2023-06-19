package p1;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		// Creating new file to the given path
		
		File f = new File("C:\\Users\\rajpo\\Desktop\\file_handling\\test1.txt");
		
		try {
			boolean val = f.createNewFile();
			System.out.println(val);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		// checking the above file exist or not
		boolean value = f.exists();
		System.out.println(value);
//		
//		// give  the length of the characters in the above file
		long valL = f.length();
		System.out.println(valL);
		
		//deleting the above file from the space
		boolean vdel = f.delete();
		System.out.println(vdel);
	
		
	}
	
	
	
	
}
