package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 11번 A+B (5)
 */

//0 0 을 입력하면 식이 종료

public class Test11 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			
			String[] input = bf.readLine().split(" ");
			
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
								
			if(x == 0 && y == 0 ) break;
			
			bw.write((x+y) + "\n");
			
			
			
		}
				
		bw.flush();
		bw.close();
		
	}
}
