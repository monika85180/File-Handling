package p1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("C:\\Users\\rajpo\\Desktop\\file_handling\\new_line.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Monika");
		bw.newLine();
		bw.write("Rathod");
		bw.newLine();
		bw.write("Divyanshi");
		bw.newLine();
		bw.write("Rathod");
		bw.newLine();
		bw.write("Avighnaa");
		bw.newLine();
		bw.write("Rathod");
		bw.close();
		fw.close();
		
		
	} catch (Exception e) {

		e.printStackTrace();
	}
}
}
