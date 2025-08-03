import java.io.*;
 
import java.net.*;

public class server{

		public static void main(String args[])
{
	try{

		ServerSocket Serversocket = new ServerSocket( 5000);

		System.out.println("server is waiting for a client");

		Socket socket = Serversocket.accept();

		System.out.println("client connected");

		//read message from client

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String clientMessage = in.readLine();

		System.out.println("clinet says " + clientMessage);

		PrintWriter out = new PrintWriter (socket.getOutputStream(), true);

		socket.close();

		Serversocket.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}