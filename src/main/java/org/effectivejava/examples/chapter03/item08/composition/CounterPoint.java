// Trivial subclass of Point - doesn't add a value component - Page 39
package org.effectivejava.examples.chapter03.item08.composition;

import java.util.concurrent.atomic.AtomicInteger;
 
public class CounterPoint  {
	private static final AtomicInteger counter = new AtomicInteger();
	private final  Point point;

	public CounterPoint(int x, int y) {
		point = new Point(x, y);
		counter.incrementAndGet();
	}
        
        /**
	 * Returns the point-view of this color point.
	 */
	public Point asPoint() {
		return point;
	}

	public int numberCreated() {
		return counter.get();
	}

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CounterPoint))
            return false;
        return ((CounterPoint)obj).point.equals(point);
     }

    @Override
    public int hashCode() {
        return 33*point.hashCode()+counter.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

   
        
        
}
