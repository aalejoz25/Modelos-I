/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Los Pinitos
 */
public class SingletonPadre {

    private static SingletonPadre Instancia = null;

    protected SingletonPadre() {
    }

    ;
   
   public static SingletonPadre getInstance() {
        if (Instancia == null) {
            Instancia = new SingletonPadre();
        }
        return Instancia;
    }
}
