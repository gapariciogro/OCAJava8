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
public class VarArgs {
    public static void main(String... args) {
        //Invoca el método de varargs con un arreglo.
        System.out.println(sumarArreglo(new int[]{6,2,9,10}))
                ;
        //Invoca el método de varargs con un listado de valores.
        System.out.println(sumarArreglo(5,10,15,25));
        //Invoca el método con varargs y java genera implicitamente un arreglo int[] vacio.
        System.out.println(sumarArreglo());
        
        
        
        //Si hay un método con la firma exacta, ese es invocado en lugar del que tiene varargs.
        System.out.println(dividirArreglo());
        
        System.out.println(dividirArreglo(new int[]{100,3}));
        
        
        System.out.println(dividirArreglo(25, 3));
    }
    
    
    
    public static int sumarArreglo(int... arr) {
        int suma = 0;
        for (int x : arr) {
            suma = suma +x;
        }
        return suma;
    }

    public static int dividirArreglo(int... arr) {
        int r = 0;
        for (int x=0; x < arr.length-1 ; x++) {
            r = arr[x]/arr[x+1];
        }
        return r;
    }

    public static String dividirArreglo() {
        return "No hay valores que dividir. Se invocó dividirArreglo()";
    }
    
    
}
