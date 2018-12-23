package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*Echo example*/
public class Server {

	public static void main(String[] args) throws IOException {

		System.out.println("Server waiting for clients...");
		
		ServerSocket ss = new ServerSocket(9912);
		Socket socekt = ss.accept();
		System.out.println("Connection establised!");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socekt.getInputStream()));
		
		String str = in.readLine();
		PrintWriter out = new PrintWriter(socekt.getOutputStream(), true);
		out.println("Server says: " + str);
		System.out.println("");
	}

}
