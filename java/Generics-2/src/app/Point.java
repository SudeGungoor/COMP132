
//Example: Point class implementing Comparable interface
//using Comparable interface, compareTo() method
//Point objects become comparable and can be sorted

package app;

public class Point implements Comparable<Point> {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
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
	
		// sort in increasing x values
		///////////////////////////////
		// greater x value should be later in the sorted list, return 1
		if (x > p.x ) return 1;
		// smaller x value should be earlier in the sorted list, return -1
		if (x < p.x ) return -1;
		
		return 0;
	}

}
