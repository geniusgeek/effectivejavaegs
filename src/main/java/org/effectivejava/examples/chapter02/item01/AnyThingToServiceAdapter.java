/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.effectivejava.examples.chapter02.item01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ekpesamuel
 * @param <T>
 */
public class AnyThingToServiceAdapter<T > implements Service{
    Class<T> clas;
    String methodName;

     
    public  static <T> AnyThingToServiceAdapter newInstance(Class<T> clas, String methodName) {
        return new AnyThingToServiceAdapter<T>(clas, methodName);
    }
    
    private  AnyThingToServiceAdapter(Class<T> clas, String methodName) {
        this.clas=  clas;
        this.methodName=methodName;
    }

    @Override
    public void install() {
        try {
            T instance=clas.newInstance();
            Method[]  method= clas.getDeclaredMethods();
            for(Method m:method){
                if(m.getName().equals(methodName)){
                    m.invoke(new Object(), null);
                }
            }
        } catch (InstantiationException ex) {
            Logger.getLogger(AnyThingToServiceAdapter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AnyThingToServiceAdapter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AnyThingToServiceAdapter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(AnyThingToServiceAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

    @Override
    public String toString() {
        return this.getClass().getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
