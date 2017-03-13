/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cequality;

import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author Gilberto
 */
public class Arrays {
    static public void main(String... args) {
        int[] arr = new int[3];
        for (int x : arr) {
            System.out.println(x);
        }

        //Un arrgelo es un "objeto" asi que se pasa la referencia al objeto como valor
        //En este ejemplo, el arreglo se modifica dentro del metodo y surte efecto aun despues
        metodo(arr);
        for (int x : arr) {
            System.out.println(x);
        }


        int[] arr2 = new int[] {3,1,2};
        //int[] arr2 = new int[3] {3,1,2};  //No compila, para usar {} o no lleva el new 
        //o no lleva el tamaño del arreglo
        for (int x : arr2) {
            System.out.println(x);
        }

        int[] arr3 = {6,7,8};
        //int[] arr2 = new int[3] {3,1,2};  //No compila, para usar {} o no lleva el new 
        //o no lleva el tamaño del arreglo
        for (int x : arr3) {
            System.out.println(x);
        }

        final int arr4 [] = new int[2];
        arr4[0] = 20;
        arr4[1] = 30;
        for (int x : arr4) {
            System.out.println(x);
        }
        
        BigDecimal[] arr5 = {new BigDecimal("2.0"), new BigDecimal("1.0"), new BigDecimal("1.0")};
        for (Object x : arr5) {
            System.out.println(x);
        }
        
        //No viene el el examen pero es util:
        System.out.println(java.util.Arrays.toString(arr5));
        
        java.util.Arrays.sort(arr5);
        
        System.out.println(java.util.Arrays.toString(arr5));
     
        
        Integer[] arr6 = {1,2,3,4,5,6};
        List<Integer> l = java.util.Arrays.asList(arr6);
        l.set(0, new Integer(10)); //El cambio aplica al arreglo y a la lista.
        arr6[5] = 60;   //El cambio aplica al arreglo y a la lista.
        
        System.out.println("Arreglo:" + java.util.Arrays.toString(arr6));
        
        for (Object x : arr6) {
            System.out.print(x + ",");
        }
        
        
    }
    
    public static void metodo(int[] arr) {
        arr[0] = Integer.MAX_VALUE;
    }
}
