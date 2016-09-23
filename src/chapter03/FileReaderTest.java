package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis = null;
		try {
			fr = new FileReader( "1234.txt" );
			
			int data = -1;
			int count = 0;
			while( (data = fr.read()) != -1 ){
				System.out.print( (char)data );
				count++;
			}
			
			System.out.println( "" );
			System.out.println( "읽은 횟수:" + count);
			
			System.out.println( "==================" );
			
			fis = new FileInputStream( "1234.txt" );
			count = 0;
			while( (data = fis.read()) != -1 ){
				System.out.print( (char)data );
				count++;
			}
			System.out.println( "" );
			System.out.println( "읽은 횟수:" + count);
			
		} catch( FileNotFoundException ex ){
			System.out.println( "error:" + ex );
		} catch( IOException ex ){
			System.out.println( "error:" + ex );
		} finally {
			try{
				if( fr != null ) {
					fr.close();
				}
			} catch( IOException ex ) {
				ex.printStackTrace();
			}
		}

	}

}
