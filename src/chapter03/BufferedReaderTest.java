package chapter03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			// 기반 스트림
			FileReader fr = new FileReader( "./src/chapter03/BufferedReaderTest.java");
			// 보조 스트림
			br = new BufferedReader( fr );
			
			String line = null;
			int index = 0;
			while( (line = br.readLine() ) != null ) { //br.readLine() 은 왜 line에 넣어 주는지
				System.out.print( ++index );
				System.out.print(":");
				System.out.print( line );
				System.out.print( "\n");
			}
			
		} catch ( IOException ex ){
			System.out.println( "error:" + ex);
		} finally {
			try{
				if( br != null ){
					br.close();
				}
				
			} catch ( IOException ex ) {
				System.out.println( "error:" + ex);
			}
		}
	}
}
