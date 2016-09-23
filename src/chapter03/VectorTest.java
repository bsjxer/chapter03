package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.addElement( "둘리" );
		vector.addElement( "마이콜" );
		vector.addElement( "도우넛" );
		
		//순회1
		int count = vector.size();
		for( int i = 0; i < count; i++ ) {
			String s = vector.elementAt( i );
			System.out.println( s );
		}
		
		vector.remove( 1 );
		
		//순회2
		Enumeration<String> enumeration = vector.elements();
		while( enumeration.hasMoreElements() ) {
			String s = enumeration.nextElement();
			System.out.println( s );
		}
		
	}

}
