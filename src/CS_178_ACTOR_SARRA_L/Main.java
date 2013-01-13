/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CS_178_ACTOR_SARRA_L;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarra, Luigi Miguel
 */
public class Main{

    public static void main(String args[]){
        
      Stack newStack= new Stack(50);

      Pusher NewPusher01 = new Pusher(newStack, "First Value ","1st Pusher");
      NewPusher01.start();
      Pusher NewPusher02 = new Pusher(newStack, "Second Value ", "2nd Pusher");
      NewPusher02.start();
      Popper NewPop01 = new Popper(newStack, "Popper");
      NewPop01.start(); 
      
    }
}
