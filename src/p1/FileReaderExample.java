package p1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

      File f = new File("C:\\Users\\rajpo\\Desktop\\file_handling\\new_file.txt");
      try {
    	  FileReader fr = new FileReader(f);
    	  int i;
    	  for(i=0;i<f.length();i++)
    		  System.out.print((char)fr.read());
 
    	  
      }catch(Exception e) {
    	  e.printStackTrace();
      }
    }
}
