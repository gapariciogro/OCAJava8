/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cequality.inheritance2;

//MiInterfaz debe ser pública para poder ser accesada
//si no tiene el modificador publis solo es accesible en el paquete
//import com.cequality.inheritance.MiInterfaz;

import com.cequality.inheritance.MiInterfaz2;

/**
 *
 * @author Gilberto
 */
//public class MiClase implements MiInterfaz{
public class MiClase{
    public static void main(String args[]) {
        System.out.println(MiInterfaz2.CONSTANTE);
    }
}
