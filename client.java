import java.io.*;

import java.net.*;

public class client{

		public static void main(String args[])
{
try{

	Socket socket = new Socket("localhost",5000);

	//send message to server

	PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

	System.out.println("Hi server,this is client!. I am one peice fan");

	//read response from server

	BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputSteam()));

	String serverResponse = in.readLine();

	System.out.println("server says"+serverResponse);

	socket.close();
}catch(Exception e){
		e.printStackTrace();
}
}
}
