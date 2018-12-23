package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("Client started!");
		Socket socket = new Socket("localhost", 9999);
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite broj");
		int number = Integer.parseInt(userInput.readLine());
		
		PrintWriter toServer = new PrintWriter(socket.getOutputStream(), true);
		toServer.println(number);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("Server says: " + in.readLine());
		
		
		socket.close();
	}

}
