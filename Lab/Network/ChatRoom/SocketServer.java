import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
 public static void main(String[] args) {
	 try {//waiting for a connection on port 8000.
		 ServerSocket serverSock = new ServerSocket(8000);
		 Socket connectionSock = serverSock.accept(); 

		 BufferedReader clientInput = new BufferedReader(new InputStreamReader(connectionSock.getInputStream()));
		 DataOutputStream clientOutput = new DataOutputStream(connectionSock.getOutputStream());
		 //connection made, waiting for client to send their name
		 String clientText = clientInput.readLine();
		 System.out.println("From Client: "+clientText);
		 //reply message
		 String replyText = "Hello! I'm server\n";
		 clientOutput.writeBytes(replyText);
		 
		 clientInput.close();
		 clientOutput.close();
		 serverSock.close();
	 }
	 catch (IOException e) {
		 System.out.println(e.getMessage());
	 }
 }
}
