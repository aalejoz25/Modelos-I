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
public class fabricaCuerpo implements fabricaAbstracta{

    @Override
    public productoAbstracto crearProducto() {
        return new Cuerpo();
    }
    
}
