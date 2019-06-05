import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Chat implements Runnable{
	private Socket socket;
	public Chat(Socket socket) {this.socket = socket;}
	public void run() {
		try {
			BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String clientText = clientInput.readLine();
				System.out.println("From Client: "+clientText);
				if(clientText.equals("bye")) break;
			}
			clientInput.close();
			socket.close();
		}catch (Exception e) { e.printStackTrace();}
	}
}
