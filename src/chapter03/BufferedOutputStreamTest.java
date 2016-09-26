package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null; // try문 안에 생성시 지역변수로 선언. finally 문에서 사용 불가
		
		try {
			// 기반 스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream( "01234.txt" );
			// 보조 스트림(기반스트림)
			bos = new BufferedOutputStream( fos, 5 );
			
			for( int i = '0'; i < '9'; i++ ) {
//			for( int i = 48; i < 57; i++ ) -> 실제 저장될 때
				bos.write( i );
				bos.flush(); // 내부 버퍼를 비움(파일에 쓰기)
				
			}
		} catch ( FileNotFoundException ex ) {
			System.out.println( "error:" + ex );
		} catch ( IOException ex ) {
			System.out.println( "error:" + ex);
		} finally {
			try {
				if( bos != null){
					bos.close(); // 보조스트림만 닫으면 기반 스트림도 자동으로 닫힘.
				}
			} catch ( IOException ex) {
				System.out.println( "error:" + ex);
			}
		}
		
		
	}

}
