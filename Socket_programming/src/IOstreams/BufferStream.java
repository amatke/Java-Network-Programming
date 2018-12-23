package IOstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*OutputStream pise samo jedan karakter u trenutku - ovo je neefikasno jer server salje podatke
bajt po bajt. Ovo se moze ubrzati koriscenjem bafera.
Podaci se salju po blokovima.*/
public class BufferStream {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("primer4.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("primer5.txt"));
		
		String line = null;
		
		while( (line = reader.readLine()) != null) {			//kopiramo iz primer4 u primer5
			writer.write(line);
			writer.newLine(); 		//ovo je separator za novi red
		}
		
		reader.close();
		writer.close();
	}

}
