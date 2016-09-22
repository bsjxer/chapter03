package chapter03;

public class StringTest {

	public static void main(String[] args) {
		String s = "c:\\temp";     // \\ => 역슬래쉬를 출력하기 위한 이스케이프
		System.out.println( s );
		String s1 = "\"he'llo\"";   //  \" => "출력하기 위한 이스케이프 
		System.out.println( s1 );
		
		// \t => tab
		// \n => new line
		// \r => carriage return
		System.out.print( "hello\tworld\r\n" );
		System.out.print( "=============");
	}

}
