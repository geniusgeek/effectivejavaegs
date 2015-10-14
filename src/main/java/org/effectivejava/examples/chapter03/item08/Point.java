// Simple immutable two-dimensional integer point class - Page 37
package org.effectivejava.examples.chapter03.item08;

public abstract class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}

//	 //Broken - violates Liskov substitution principle - Pages 39-40
        //important property of types x,y should also hold for subtype so that any
        //method written for subtype should also work well on type
        //hence this methodology is strict on Runtime Class and fails to compare based on important x and y types
        //thus this is not acceptable
//	 @Override public boolean equals(Object o) {
//            if (o == null || o.getClass() != getClass())
//            return false;
//            Point p = (Point) o;
//            return p.x == x && p.y == y;
//            
//	 }

	// See Item 9: always override hashcode when overriding equals
	@Override
	public int hashCode() {
		return 31 * x + y;//use hashcode algorithm
	}
}
