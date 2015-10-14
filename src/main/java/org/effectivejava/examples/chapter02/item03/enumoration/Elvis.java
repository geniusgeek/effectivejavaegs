// Enum singleton - the preferred approach - page 18
package org.effectivejava.examples.chapter02.item03.enumoration;

/**
 * This is verry interesting
 * @author ekpesamuel
 */
public enum Elvis {
	INSTANCE;

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
 	}

        @Override
        public String toString() {
            return Elvis.class.getSimpleName(); //To change body of generated methods, choose Tools | Templates.
        }
        

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
               System.out.println("name is: "+elvis);

	}
}
