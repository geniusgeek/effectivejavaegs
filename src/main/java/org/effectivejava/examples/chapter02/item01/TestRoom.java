/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.effectivejava.examples.chapter02.item01;

/**
 *
 * @author ekpesamuel
 */
public class TestRoom {
    static Room room=Rooms.getRoom(1);
      

     public static void main(String args[]){
         System.out.println("first Name"+ room);
         //we want two bed room;
          
         room=Rooms.getRoom(2);
         System.out.println(room);

      }
}
