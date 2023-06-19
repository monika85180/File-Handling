package p1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class B {
	public static void main(String[] args) {
		try {
			// serializable files are only applicable for pdf, excel, mp4 etc
			FileOutputStream fos = new FileOutputStream("C:\\Users\\rajpo\\Desktop\\file_handling\\A.ser");
			A a1 = new A();

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);
			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
