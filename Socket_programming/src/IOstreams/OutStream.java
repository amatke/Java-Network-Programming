package IOstreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutStream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("primer2.txt", true);
		
		File f = new File("primer2.txt");
		if(!f.exists())
			f.createNewFile();
		
		String text = "\nOvo je vezba za FileOutputStream! Upisujemo u fajl!";
		
		fos.write(text.getBytes());
		
		fos.close();
		
	}

}
