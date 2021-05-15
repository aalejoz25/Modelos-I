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
public class Hilo1 extends Thread {

    @Override
    public void run() {
        Singleton objetohilo1 = Singleton.getInstancia();
    }

}
