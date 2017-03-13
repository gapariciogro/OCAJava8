/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cequality.inheritance;

/**
 *
 * @author Gilberto
 */
interface MiInterfaz {
    //De manera implicita las variables en interfaz
    //son final y static
    public String CONSTANTE = "Constante en MiInterfaz";
    
    public default void miMetodoDefault() {
        System.out.println("miMetodoDefault de MiInterfaz");
    }
}
