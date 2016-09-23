package chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer( "둘리" );
		queue.offer( "마이콜" );
		queue.offer( "또치" );

		while( queue.isEmpty() == false ){
			String s = queue.poll();
			System.out.println( s );
		}
		
		queue.offer( "고길동" );
		queue.offer( "희동이" );
		queue.offer( "도우넛" );

		System.out.println( queue.poll() );
		System.out.println( queue.peek() );
		System.out.println( queue.poll() );
		
	}

}
