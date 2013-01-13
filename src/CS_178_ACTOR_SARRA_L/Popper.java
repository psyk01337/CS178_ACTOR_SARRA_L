/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CS_178_ACTOR_SARRA_L;

/**
 *
 * @author Sarra, Luigi Miguel
 */
public class Popper extends Thread{
    
   private Stack stack;
    
    public Popper(Stack stack, String name){
        
        this.stack=stack;
        this.setName(name);
    }

    public void Run(){       
        
        System.out.println(this.getName() + " is called");

        if(stack.last>-1){
            
            for(int i=stack.last; i>-1; i--){
                
                  stack.pop();
            }
        }      
    }
}
