package org.effectivejava.examples.chapter02.item06;

public class EmptyStackException extends IllegalStateException {

    public EmptyStackException(String s) {
        super(s);
    }

    public EmptyStackException(String message, Throwable cause) {
        super(message, cause);
    }
    
     
}
