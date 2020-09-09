import java.io.*;
import java.net.*;
import java.util.*;

public class PerClientThread extends Thread{
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<>());
	
	Socket socket;
	PrintWriter writer;
	
	public PerClientThread(Socket socket) {
		this.socket = socket;
		try{
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		}catch(Exception e){
			
		}
	}
	public void run(){
		String name = null;
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();
			sendAll("#"+name+"���� �����̽��ϴ�");
			while(true){
				String str = reader.readLine();
				if(str == null) break;
				sendAll(name+ ">"+str);
			}
		}catch(Exception e){
			
		}finally{
			list.remove(writer);
			sendAll("#"+name+"���� �����̽��ϴ�");
		}
		
	}
	private void sendAll(String str){
		for(PrintWriter writer : list){
			writer.println(str);
			writer.flush();
		}
	}
}
