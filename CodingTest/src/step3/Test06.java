package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;	//위에 네가지가 Buffered reader 사용 필수 import
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * 날짜 : 2025.01.08
 * 이름 : 곽혜수
 * 내용 : 백준 3단계 6번 빠른 A+B
 */

public class Test06 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		/*parseInt(bf.readLine() 을 통해서 입력받을 자료형 변경*/
		
		int t = Integer.parseInt(bf.readLine());	//int t  입력받고
		
		
		for(int n = 0; n < t ; n++) {
			
			String[] input = bf.readLine().split(" ");
			/* .split( 구분기준 ); */
			
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			bw.write((x+y) + "\n");
			
			/*bw.write(출력할값 + "\n"); 는 필수! -> 버퍼에 있는 값을 전부 출력시킴*/
			/*st.nextToken() 은 다음 토큰을 읽음, Token : 식별한 데이터*/
		}
		
		bw.flush();
		bw.close();  		//스트림을 닫음
					
	}

}
