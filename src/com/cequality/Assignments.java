/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cequality;

/**
 *
 * @author Gilberto
 */
public class Assignments {
    public static void main(String... args) {
        int x = 5;
        int y = x++;
        
        System.out.println("x= " + x + "y=" + y);

        int a = 5;
        int b = (a++);
        
        System.out.println("a= " + a + "b=" + b);
        
        int c = 1;
        int d = c++ + c;
        
        System.out.println("d= " + d);
        
        

    }
}
