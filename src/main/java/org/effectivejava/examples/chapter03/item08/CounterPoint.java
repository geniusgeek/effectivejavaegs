// Trivial subclass of Point - doesn't add a value component - Page 39
package org.effectivejava.examples.chapter03.item08;

 import java.util.concurrent.atomic.AtomicInteger;
 
public class CounterPoint  extends Point{
	private static final AtomicInteger counter = new AtomicInteger();
 
	public CounterPoint(int x, int y) {
		super(x,y);
		counter.incrementAndGet();
	}
        
         

	public int numberCreated() {
		return counter.get();
	}

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CounterPoint))
            return false;
        return super.equals(obj)&&((CounterPoint)obj).numberCreated()==numberCreated();
      }

    @Override
    public int hashCode() {
        return 33*super.hashCode()+counter.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

   
        
        
}
