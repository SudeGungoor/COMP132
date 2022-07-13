
// Example: Point class implementing Comparable interface

// using Comparable interface, compareTo() method
// Point objects become comparable and can be sorted

package comparable_examples;

public class Point implements Comparable<Point> {

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	// implementing CompareTo() method of Comparable interface
	// my custom sort definition for Point objects
	@Override
	public int compareTo(Point p) {

		// custom sort definition example: sort in increasing x values
		///////////////////////////////
		// greater x value should be later in the sorted list, return 1
		//if (x > p.x) return 1;
		
		// smaller x value should be earlier in the sorted list, return -1
		//if (x < p.x) return -1;
		
		// another custom sort definition example: sort in decreasing y values
		///////////////////////////////////////////////////
		// 
		//if (y > p.y) return -1;
		
		//if (y < p.y) return 1;
		
		// Exercise: sort Points in increasing distance from the origin
		
		double mydist = Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
		double pdist = Math.sqrt(Math.pow(p.x,2)+Math.pow(p.y, 2));
		
		if (mydist > pdist) return 1;
		if (mydist < pdist) return -1;
		
		return 0;
	}
	
	
}
