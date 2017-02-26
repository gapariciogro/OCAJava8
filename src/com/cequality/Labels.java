package com.cequality;

/**
 *
 * @author Gilberto
 */
public class Labels {
    
    public static void main(String[] args) {

        int x = 0;
        
        miLabel: {
           System.out.println("inside \"miLabel\" before while" + x);
           while(x < 10) {
               System.out.println("inside while " + x);
               x++;

               if (x == 2) {
                   break miLabel;
               }
           }
           System.out.println("outside while " + x);
        }
        
        
    }
}
