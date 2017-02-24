
package com.cequality;

/**
 *
 * @author gaparicio
 */
public class Equality {
    public static void main(final String[] args) {
        Integer myInteger = null;
        Long myLong = null;
        
        //Doesn't work because they are both nulls but not same type
        //System.out.println("myInteger=myLong?  " + (myInteger == myLong) );
        
        Integer myInteger2 = null;
        System.out.println("myInteger=myInteger2?  " + (myInteger == myInteger2) );
        
    }
}
