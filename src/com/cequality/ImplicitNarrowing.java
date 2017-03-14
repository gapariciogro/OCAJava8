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
public class ImplicitNarrowing {
    public static void main(String... args) {
        //destination is byte, short, char
        byte b = 1; //1 es un entero... narrowing implicito porque el valor es valido para un byte
        short s = 1;  // 1 es entero... narrowing implicito porque el valor es valido para un short
        char c = 0x33;    //0x33 es un entero en el rango de char. Realiza Narrowing implicito
        
        final short S1 = 1;
        byte b1 = S1;
        
        final char C1 = 'A';
        byte b2 = C1;
        
        short s1 = C1;
        
        //No se puede c no es una constante.
        //short s1 = c;
        
        byte b3 = 'A';
        short s3 = 'A';
        
        byte b4 = 65;
        short s4 = b4;
        //no funciona aun cuando char es más grande que byte
        //char c4 = b4;
        
        //no funciona aun cuando char es más grande que short
        //char c4 = s4;

        char c4 = S1;
        

        
        
        
        
        
        
        
        System.out.println(c);
    }
}
