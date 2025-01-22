package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 *날짜 : 2025.01.22
 *이름 : 곽혜수
 *내용 : Java 채팅 프로그래밍 실습하기 
 */

// 송신 처리 스레드 클래스
public class SenderThread extends Thread {
	
	private Socket socket;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
					
				}
				
				writer.println(msg);
				writer.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				socket.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
}



















