/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CS_178_ACTOR_SARRA_L;

/**
 *
 * @author @author Sarra, Luigi Miguel
 */
public class Runnable_Class implements Runnable{
    
    private final long count;

    Runnable_Class(long count){
        this.count=count;
    }

    public void run(){
        long result=0;
        
        for(long i=1; i<count; i++){
            
            result+=i;
        }
        
        System.out.println(result);
    }

}
