package org.effectivejava.examples.chapter02.item05;

import java.util.WeakHashMap;

public class Sum {
 	// Hideously slow program! Can you spot the object creation?
	public static void main(String[] args) {
               //Long sum=0l;//2
            //Long sum = (long) 0;//1
              // Long sum = Long.valueOf(0);//3 from top in terms of performance
             long sum = 0l;
 		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
