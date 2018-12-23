package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		System.out.println("Waiting for clients...");
		ServerSocket ss = new ServerSocket(9999);
		Socket socket = ss.accept();
		System.out.println("Client accepted");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		int number = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Client send " + number);
		
		PrintWriter toClient = new PrintWriter(socket.getOutputStream(), true);
		toClient.println("factorial of " + number + "is " + factorial(number));
		
		
		socket.close();
	}
	
	
	public static int factorial(int number) {
		
		int fact = 1;
		for(int i=1; i<=number; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
