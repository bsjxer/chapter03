package chapter03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push( "둘리" );
		stack.push( "마이콜" );
		stack.push( "고길동" );
		
		while( stack.empty() == false ) {
			String s = stack.pop();
			System.out.println( s );
		}
		
		//stack.pop()   // -> StackEmptyException 발생
		
		stack.push( "희동이" );
		stack.push( "도우넛" );
		stack.push( "또치" );
		
		System.out.println( stack.pop() );
		System.out.println( stack.peek() );
		System.out.println( stack.pop() );

	}

}
