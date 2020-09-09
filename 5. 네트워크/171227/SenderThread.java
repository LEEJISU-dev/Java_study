import java.net.*;
import java.io.*;

public class SenderThread extends Thread {
	Socket socket = null;

	public SenderThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while (true) {
				String str = reader.readLine();
				if (str.equals("bye")) {
					break;
				}
				writer.println(str);
				writer.flush();
			}
		} catch (IOException e) {

		}
	}
}
