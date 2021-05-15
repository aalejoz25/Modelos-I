/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_con_hilos;

public class Singleton {

    private static Singleton instancia;
    public static int contador = 0;

    private Singleton() {
        contador++;
    }

    public static synchronized Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void comprobacion() {
        System.out.println("Numero de instancias:" + contador);
    }
}
