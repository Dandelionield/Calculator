package Mechanics.Main;

/*
 *
 * @author Dandelion
 * 
 */

import java.awt.EventQueue;

import Graphic.Container.Dashboard;
import Arithmetic.Machine.Standard;
import Taylor.Arithmetic.Parser;

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
		
		/*System.out.print("\n\n");
		
		Parser p = new Parser("e");
    
        System.out.print(p);
		
		System.out.print("\n\n");//*/
		
    }
    
}
