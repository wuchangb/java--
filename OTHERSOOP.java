import java.io.FileWriter;
import java.io.IOException;

public class OTHERSOOP {

	public static void main(String[] args) throws IOException {
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" JAVA");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" JAVA2");
		f2.close();
		
	}

}
