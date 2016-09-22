package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		// Auto Boxing
		//int i = Integer.parseInt( "12345" );
		//Integer i2 = new Integer( i );
		Integer i2 = Integer.parseInt( "12345" );
		String s2 = String.valueOf( i2 );
		double d = Double.parseDouble( "3.14" );
		
		System.out.println( i2 );
		System.out.println( s2 );
		System.out.println( d );
		
		int num = Character.getNumericValue( 'A' );
		System.out.println( num );
		
		int i3 = Integer.parseInt( "f", 16 );
		System.out.println( i3 );
		
		String s = Integer.toBinaryString( 15 );
		System.out.println( s );
		
		int countBit = Integer.bitCount( 15 );
		System.out.println( countBit );
		
		String hexStr = Integer.toHexString( 255 );
		System.out.println( hexStr );
		
		
	}

}
