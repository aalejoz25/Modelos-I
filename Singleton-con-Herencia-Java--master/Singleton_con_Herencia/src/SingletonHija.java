/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Los Pinitos
 */
public class SingletonHija extends SingletonPadre {

    private static SingletonHija Instancia = null;

    public static SingletonPadre getInstance() {
        if (Instancia == null) {
            Instancia = new SingletonHija();
        }
        return Instancia;
    }
}
