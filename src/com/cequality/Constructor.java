package com.cequality;

/**
 *
 * @author gaparicio
 */
public class Constructor {
    
    private int miNumeroConJava7;

    /**
     * Este pareciera ser un constructor pero no lo es
     * por el hecho que tiene tipo de retorno especificado
     * (en este caso es void). Los constructores no llevan
     * tipo de retorno, ni siquiera void.
     */
    public void Constructor() {
        System.out.println("Not a constructor");
    }
    
    public int getMiNumeroConJava7() {
        return miNumeroConJava7;
    }

    public void setMiNumeroConJava7(int miNumeroConJava7) {
        this.miNumeroConJava7 = miNumeroConJava7;
    }
    
    public static void main(String[] args) {
        Constructor c = new Constructor();
        c.Constructor();
        //Los numeros en Java 7 se pueden especificar con el seprador de guion bajo para
        //facilitar la lectura de los mismos.
        //Se puede poner en cualquier lugar excepto _999 ó 999_ ó 99_.99 ó 99._99
        c.setMiNumeroConJava7(1_000_000);
        System.out.println(c.getMiNumeroConJava7());
        c.setMiNumeroConJava7(1_0_0_0_0_0_0);
        System.out.println(c.getMiNumeroConJava7());
        
        c = null;
        c.metodoEstatico();

    }
    
    public static void metodoEstatico() {
        System.out.println("Metodo Estatico invocado");
    }

}
