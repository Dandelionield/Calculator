package Mechanics.Main;

/*
 *
 * @author Dandelion
 * 
 */

import java.awt.EventQueue;

import Graphic.Container.Dashboard;
import Arithmetic.Machine.Standard;

public class MainRunnable{

    public static void main(String[] abc){
		
		EventQueue.invokeLater(new Runnable(){

            public void run(){
                
                try{

                    new Dashboard<Standard>(new Standard());
					
                }catch(Exception e){

                    e.printStackTrace();
					
                }
				
            }
			
        });
		
    }
    
}
