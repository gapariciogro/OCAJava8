package com.cequality;

/**
 *
 * @author gaparicio
 */
public class NumericPromotion {
    public static void main(String... args) {
        // 5 is integer but is promoted to long
        long x = 5;
        // add L is not necessary, but is permited
        long x2 = 5L;
        
        // 5 is integer but is promoted to double
        double y = 5;
        // add D isn't necessary, but allowed
        double y2 = 5D;
        
        //Same for float
        float z = 5;
        float z2 = 5F;
        
        //Problems value to large to fit in an int.
        //Compilation error: integer number too large
        
        //long a = 1234567890123456789;
        
        //In order to work we have to use L at the end.
        long a = 1234567890123456789L;
        
    }
}
