package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

	/*Echo example*/
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("Client started");
		
		Socket socket = new Socket("localhost", 9912);
		
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter some text:");
		String str = userInput.readLine();
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		out.println(str);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String s = in.readLine();
		System.out.println(s);
	}

}
