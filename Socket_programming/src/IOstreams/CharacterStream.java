package IOstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*Kada radimo sa karakterima  najbolje je koristiti InputStreamReader/OutputStremwriter klase*/
public class CharacterStream {

	public static void main(String[] args) throws IOException {

		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("primer4.txt"));
		InputStreamReader in = new InputStreamReader(new FileInputStream("primer4.txt"));
		
		out.write("cao karakteri! bla bla.");
		out.write("evo jos nesto da napisemo");
		//out.flush();		
		out.close();	//close() poziva flush() metodu
		
		
		
		int data = in.read();
		while(data != -1) {
			System.out.print((char)data);
			data = in.read();
		}
	
		in.close();
	}

}
