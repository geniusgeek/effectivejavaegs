/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.effectivejava.examples.chapter02.item03.enumoration;

/**
 *
 * @author ekpesamuel
 */
public enum ThreadSafeLazyLoadedIvoryTower {

  INSTANCE;

   
  /**
   * The instance gets created only when it is called for first time.
   * Lazy-loading
   */
  public  static ThreadSafeLazyLoadedIvoryTower getInstance() {
 

    return INSTANCE;
  }
}