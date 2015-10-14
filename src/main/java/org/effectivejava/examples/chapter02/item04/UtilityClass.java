// Noninstantiable utility class
package org.effectivejava.examples.chapter02.item04;

import sun.applet.Main;

public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		throw new AssertionError();
	}
    public static void main(String args[]){
        
    }
}
