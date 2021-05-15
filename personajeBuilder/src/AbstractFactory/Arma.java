/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Zocalo
 */
public class Arma implements productoAbstracto {

    @Override
    public void crearParte() {
        System.out.println("se ha creado una arma");
    }

}
