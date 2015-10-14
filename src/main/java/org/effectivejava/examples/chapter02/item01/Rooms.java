/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.effectivejava.examples.chapter02.item01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ekpesamuel
 */
public class Rooms {

     static String roomName="ordinary";
      static List<Room> roomList= Collections.unmodifiableList(new ArrayList<Room>());//new ArrayList<>();
     
     
    private Rooms(){
        


    }
    
    
    public static void  registerRoom(Room room) {
         roomList.add(room);
     }

    
    public static Room getRoom(int roomNumber) {
         
         return RoomFactory.getRoom(roomNumber);
    }
    
    
    private static final class OrdinaryRoom implements Room{
         @Override
        public String toString() {
            return OrdinaryRoom.class.getSimpleName();
        }
        
        
    }
    
    private static final class TwoBedRoom implements Room{
         @Override
        public String toString() {
            
            return TwoBedRoom.class.getSimpleName();
        }
        
        
    }
    private static final class ThreeBedroom implements Room{
         @Override
        public String toString() {
            return ThreeBedroom.class.getSimpleName();
        }
        
        
    }
    private static final GenericRoomFactory RoomFactory= new GenericRoomFactory() {
        public Room getRoom(int index) {
            return  roomList.get(index);
        }

         

        
    };
}
