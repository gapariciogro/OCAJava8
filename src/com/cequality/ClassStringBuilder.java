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
public class ClassStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("Hola");
        StringBuilder sb2 = new StringBuilder("Hola");
        
        //Not equals even when same content.
        //StringBuilder doesn't overwrite equals method so it uses default
        System.out.println("sb1 equals sb2 ? " + (sb1.equals(sb2)));
        
        //But comparing as Strings, is true
        System.out.println("sb1.toString() equals sb2.toString() ? " + ((sb1.toString()).equals(sb2.toString())));
    }
}
