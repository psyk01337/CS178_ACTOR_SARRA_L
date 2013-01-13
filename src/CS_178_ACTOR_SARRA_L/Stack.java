/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CS_178_ACTOR_SARRA_L;

/**
 *
 * @author Sarra, Luigi Miguel
 */
public class Stack{
    
 protected int size;
 protected int last;
 protected String[] arr;


 public Stack(int size){
     
     this.size=size;
     arr= new String[size];
     last=-1;     
 }

 public synchronized void pop(){
     
  if(last > -1){
      
     System.out.println(arr[last]+ " is popped from the stack");
     --last;
  }
 }

 public synchronized void push(String val){
     
  if(last < size){
      
     arr[++last]=val;
     System.out.println(val+ " is pushed into the stack");
  }
 }

 public void display(){
     
     for(int i=last; i!=0; i--)
           System.out.println(arr[i]);
 }

}
