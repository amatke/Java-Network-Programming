package IOstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIn {

	public static void main(String[] args)  {

		System.out.println("Unesite broj porta: ");
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(in);

		
		try {
			int portNum = Integer.parseInt(reader.readLine());
			System.out.println(portNum);
		}
		catch (Exception e) {
			System.out.println("niste uneli broj! " + e.getMessage());
		}
	}

}
