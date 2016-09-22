package chapter03;

public class StringTest4 {
	public static void main(String[] args){
		String s = "aBcAbCabcABC";
		
		System.out.println( s.length() );
		System.out.println( s.charAt(2) );
		System.out.println( s.indexOf( "abc" ));
		System.out.println( s.replace( 'a', 'R' ) );
		System.out.println( s.replaceAll( "abc", "123" ) );
		System.out.println( s.substring( 3 ));
		System.out.println( s.substring( 3, 6 ));
		
		String a = " ab  cd       ";
		String b = "f,efg,dwq,dwdwq";
		
		String c = a.concat( b );
		System.out.println( c );
		System.out.println( a + b );
		
		System.out.println( "----" + a.trim() + "----" );
		System.out.println( "----" + a.replaceAll(" ", "") + "----" );
		//
		//  정규표현식
		//  [0-9]+    0 1 2 3 345 4123
		//  [a-zA-Z]+
		//  |
		//
		String[] t = b.split( "," );
		for( String k : t ){
			System.out.println( k );
		}
		
		// + 연산자
		String[] arr = { "Hello", "World", "java" };
		String str = "";
		for( String str2: arr ) {
			str = str + str2;
		}
		
		//String str2 = "Hello" + " World" + " java";
		//StringBuffer sb = new StringBuffer( "Hello" );
		//sb.append( " World" );
		//sb.append( " java" );
		String str2 = new StringBuffer( "Hello").
					  append( " Worls").
					  append( " java").
					  toString();
					 
		
		System.out.println( str2 );
	}
}
