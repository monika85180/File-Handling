package p1;

import java.io.IOException;

public class FileWriter {

    public static void main(String[] args) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter("C:\\Users\\rajpo\\Desktop\\file_handling\\new_file.txt");
            // Perform necessary operations with the FileWriter object
            
            fw.write("I'm a software developer");
                        
            fw.write(97);
            char[]  ch = {'a','b', 'c', 'd', 'e', 'f'};
            fw.write(ch);
            
            
            fw.close(); // Remember to close the FileWriter when you're done
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



