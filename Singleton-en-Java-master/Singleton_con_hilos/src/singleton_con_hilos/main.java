/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_con_hilos;

/**
 *
 * @author Álvaro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1();
        h1.start();
        Hilo2 h2 = new Hilo2();
        h2.start();
    }

}
