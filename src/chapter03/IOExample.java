package chapter03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {
	public static void main( String[] args ) {
		byte[] src = { 0, 1, 2, 3, 4, 5};
		byte[] dest = null;
		
		ByteArrayInputStream bis = new ByteArrayInputStream( src );
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int data = -1;
		while( (data = bis.read()) != -1 ){
			bos.write( data );
		}
		
		dest = bos.toByteArray();
		
		System.out.println( Arrays.toString(src) );
		System.out.println( Arrays.toString(dest) );
		
	}
}
