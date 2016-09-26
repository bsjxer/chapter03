package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}

			System.out.println("**********파일정보***********");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "Bytes");
			Date date = new Date( file.lastModified() );
			SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-mm-dd a hh:mm:ss");
			System.out.println( sdf.format( date ));
			
			
			System.out.println("**********전화번호 리스트***********");

			// 기반 스트림(byte기반)
			FileInputStream fis = new FileInputStream("phone.txt");
			// 보조스트림(byte->char)
			InputStreamReader isr = new InputStreamReader( fis, "UTF-8");
			// 보조스트림(line단위 입력)
			br = new BufferedReader( isr );
			
			String line = null;
			while( (line = br.readLine()) != null ) {
				StringTokenizer st = new StringTokenizer( line, "\t "); // \t다음에 스페이스 공간. \t와 스페이스 두 공간으로 나눈다는 것을 의미
				int index = 0;				
				while( st.hasMoreTokens()) {
					String token = st.nextToken();
					if( index == 0) { // 이름
						System.out.print( token + ":");
					} else if( index == 3) { // 번호
						System.out.print( token );
					} else {
						System.out.print( token + "-");
					}
					index++;
				}
				
				System.out.println( "" );
			}
			
			
		} catch (IOException ex) {
			System.out.println("eror:" + ex);
		} finally {
			try {
				if ( br != null ){
					br.close();
				}
			} catch ( IOException ex ){
				System.out.println("eror:"+ex);
			}
		}
	}

}
