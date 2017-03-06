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
public class Initializers {
    private final int MI_CONSTANTE3;
    
    {
        campoX = "Valor de mi CampoX";
    }
    private String campoX = "Valor inicial de mi campoX";
    
    
    
    static {
        //Se ocupan los bloques státicos cuando la inicialización de una variable
        //requiere más de una línea.
        //Aunque algunos sugieren evitar este uso y usar un mpétodo por ejemplo...
        MI_CONSTANTE = "Valor de mi constante";
        //System.out.println(MI_CONSTANTE2);    //Illegal forward reference
        
    }
    private static final String MI_CONSTANTE;
    private static final String MI_CONSTANTE2 = obtenerValorConstante2();
    
    
    public Initializers() {
        //una variable de instancia final se puede inicializar en el contructor.
        MI_CONSTANTE3 = -10;
    }
    
    public static void main(String... args) {
        System.out.println("OK " + Initializers.MI_CONSTANTE);
        
        System.out.println("OK " + Initializers.MI_CONSTANTE2);
        
        Initializers i = new Initializers();
        System.out.println(i.MI_CONSTANTE3);
        
        
        System.out.println("Valor de mi campo X = " + i.campoX);
    }

    private static String obtenerValorConstante2() {
        return "Valor de mi constante 2";
    }
}
