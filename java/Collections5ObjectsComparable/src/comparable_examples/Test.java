
// Using your own objects as collection elements (Example: List of Point objects)
// Sorting lists of arbitrary objects using Comparable interface (compareTo method)

package comparable_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		// A List of Point objects
		List<Point> points = new ArrayList<Point>();
		
		// a Point object
		Point p1 = new Point(1, 2);
		
		// adding Point object elements to the list points
		points.add(p1);
		points.add(new Point(4,1));
		points.add(new Point(2,8));
		points.add(new Point(9,5));
		points.add(new Point(7,4));
		
		for (Point p : points)
			System.out.println(p);

		// Sorting lists of point objects using Collections class sort method
		// before implementing Comparable<Point>, and CompareTo() method -- (does not work. no natural order for Point objects)
		
		// after implementing CompareTo() method of Comparable interface in Point class

		Collections.sort(points);
		
		System.out.println("\n=== After my custom sort: ===");
		
		for (Point p : points)
			System.out.println(p);
	}

}










