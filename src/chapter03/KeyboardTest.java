package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			// 기반 스트림은 표준 입력 System.in(바이트기반)

			// 보조 스트림 (byte->char)
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			
			// 보조 스트림 ( 라인단위로 읽음 )
			br = new BufferedReader( isr );
			
			String inputLine = null;
			while( (inputLine = br.readLine()) != null ){
				if( "exit".equals( inputLine) == true ) {
					return;
				}
				
				System.out.println( ">>" + inputLine);
			}
			
		} catch (IOException ex) {
			System.out.println("error:" + ex);
		} finally {
			try {
				if( br != null) {
					br.close();
				}
			}catch( IOException e){
				System.out.println("eror:"+e);
			}
		}
	}

}
