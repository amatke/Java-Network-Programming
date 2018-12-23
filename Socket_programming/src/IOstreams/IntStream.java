package IOstreams;

import java.io.FileInputStream;
import java.io.IOException;

public class IntStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("primer1.txt");
		
		int data = fis.read();
		
		while(data != -1) {
			
			System.out.print((char)data);
			data = fis.read();
		}
		
		fis.close();
		
	}
}
