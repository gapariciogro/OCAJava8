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
public class ClassString {
    public static void main(String... args) {
        String hola = "Hola";
        String saludo = "Hola";
        
        System.out.println("hola y saludo apuntan al mismo objeto? " + (hola == saludo) );
        StringBuilder sb = new StringBuilder("**");
        System.out.println("Mi cadena de texto".replace("e", sb));
    }
}
