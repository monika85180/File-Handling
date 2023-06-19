package p1;

import java.io.BufferedReader;
import java.io.FileReader;
//Buffered reader improve the performance to read it from file

public class BufferedReaderExample {
public static void main(String[] args) {
	try {
		
		FileReader fr = new FileReader("C:\\Users\\rajpo\\Desktop\\file_handling\\new_line.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		for(i=0;i<100;i++)
		System.out.print((char)br.read());
		System.out.println(br.readLine());
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
