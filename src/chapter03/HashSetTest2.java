package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<Money> set = new HashSet<Money>();
		
		set.add( new Money( 1 ) );
		set.add( new Money( 2 ) );
		set.add( new Money( 3 ) );
		set.add( new Money( 2 ) );
		
		Iterator<Money> it = set.iterator();
		while( it.hasNext() ) {
			Money m = it.next();
			System.out.println( m );
		}

	}

}
