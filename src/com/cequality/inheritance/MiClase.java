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
public class MiClase implements MiInterfaz{
    public static final String CONSTANTE = "Constante en MiClase... mala práctica (shadowing)";
    
    MiClase() {
        System.out.println("Constructor MiClase()");
    }
    public void sayHello() {
        System.out.println(this.getMensaje());
    }
    
    private String getMensaje() {
        return "Hello! desde MiClase";
    }

    public void sayHello2() {
        System.out.println(this.getMensaje2());
    }
    
    protected String getMensaje2() {
        return "Hello2! desde MiClase";
    }
    
    
    public static void main() {
        
    }
    
    public static void main(String args[]) {
        MiInterfaz i = new MiClase();
        
   //En tiempo de compilación la variable de referencia
   //debe tener definido el método que se invoca, de lo contrario
   //marca error de compilación.
    //i.sayHello();
        MiClase c = new MiClase();
        c.sayHello();
        
        System.out.println(i.CONSTANTE);
        
        System.out.println(c.CONSTANTE);
        
        //Las variables en la interfaz son finales 
        //aun cuando no tengan el modificador.
        //por lo tanto no puede redefinirse
        //i.CONSTANTE = "Otro mensaje"; 
    }
}
