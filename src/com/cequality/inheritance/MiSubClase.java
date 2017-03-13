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
public class MiSubClase extends MiClase{
    public String getMensaje() {
        return "Hola! desde MiSubClase";
    }

    public String getMensaje2() {
        return "Hola2! desde MiSubClase";
    }
    
    
    public static void main(String... args) {
        MiClase c = new MiSubClase();
        //sayHello del padre porque es private
        //y por tanto no busca sobrescritos en hijos
        c.sayHello();
        
        MiSubClase sbc = new MiSubClase();
        //sayHello del padre porque es private
        //y por tanto no busca sobrescritos en hijos
        sbc.sayHello(); //sayHello en el padre
        
        //Invoca getMensaje2 del hijo
        c.sayHello2();
        
        //Invoca getMensaje2 del hijo
        sbc.sayHello2();
        
        MiClase objMiClase = new MiClase();
        
        objMiClase.sayHello2();
        
        //Invocación de método "defualt"
        sbc.miMetodoDefault();
    }
}
