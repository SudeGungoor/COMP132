
// Example: Generic method maximum returns the largest of three objects as arguments.
// Implementing generic interface 

package app;

public class TestMaximum {

	public static void main(String[] args) {
		
		int a = 3, b = 7, c = 5;
		System.out.printf( "Maximum of %d, %d and %d is %d\n\n", 
				a, b, c, maximum( a, b, c ) );
		
		double d = 5.5, e = 9.9, f = 1.1;
		System.out.printf( "Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 
				d, e, f, maximum( d, e, f ) );
		
		
		String s1 = "apple", s2 = "orange", s3 = "mango";
		
		System.out.printf( "Maximum of %s, %s and %s is %s\n\n", 
				s1, s2, s3, maximum( s1, s2, s3 ) );
		
		Point p1 = new Point(1, 5), p2 = new Point(5, 2), p3 = new Point(3, 7);
		
		System.out.printf( "Maximum of %s, %s and %s is %s\n", 
				p1, p2, p3, maximum( p1, p2, p3 ) );		

	} // end of main
	
	// Example: Generic method that use a type parameter as the return type
	// Implementing generic interface 
	// generic interfaces enable you to specify, with a single interface declaration, a set of related types. 

	// T extends Comparable<T>: only objects of classes that implement 
	// interface Comparable<T> can be used with this method. 
	
	// by "extends": upper bound for the parameter is specified.
	// Comparable is known as the upper bound of the type parameter T.
	// By default, Object is the upper bound

	// important! always use keyword "extends" regardless of whether the type 
	// parameter extends a class or implements an interface. 
	
	// determines the largest of three Comparable objects
	public static < T extends Comparable< T > > T maximum( T x, T y, T z )
	{
		T max = x; // assume x is initially the largest 

		if ( y.compareTo( max ) > 0 ) 
			max = y; // y is the largest so far

		if ( z.compareTo( max ) > 0 )
			max = z; // z is the largest

		return max; // returns the largest object
	} // end method maximum

}
