package p1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\rajpo\\Desktop\\file_handling\\A.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            A a = (A) ois.readObject();
            System.out.println(a.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
