// Test program that uses CounterPoint as Point
package org.effectivejava.examples.chapter03.item08;

import org.effectivejava.examples.chapter03.item08.composition.*;
import java.util.HashSet;
import java.util.Set; 

public class CounterPointTest {
	// Initialize UnitCircle to contain all Points on the unit circle
	private static final Set<Point> unitCircle;
	static {
		unitCircle = new HashSet<Point>();
		unitCircle.add(new CounterPoint(1, 0));
		unitCircle.add(new ColorPoint(0, 1,Color.BLUE));
		unitCircle.add(new CounterPoint(-1, 0));
		unitCircle.add(new ColorPoint(0, -1,null));
	}

	public static boolean onUnitCircle(Object p) {
		return unitCircle.contains(p);
                 
	}

	public static void main(String[] args) {
		Point p1 = new ColorPoint(0, -1,null);
                Point cp= new ColorPoint(0,1, Color.BLUE);
		Point p2 = new CounterPoint(1, 0);
                
 		System.out.println("cp: "+onUnitCircle(cp));

		// Prints true
		System.out.println("p1: "+onUnitCircle(p1));

		// Should print true, but doesn't if Point uses getClass-based equals
		System.out.println("p2: "+onUnitCircle(p2));
	}
}
