/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta.equipamientopersonajes;

/**
 *
 * @author Álvaro
 */
public class Armaduras_humano implements  Armaduras {

     private String armadura;

    @Override
    public void opcion(int opcion) {
        switch (opcion) {
            case 1:
                this.armadura = "Creando armadura para humano 1";
                break;
            case 2:
                this.armadura = "Creando armadura para humano 2";
                break;
            case 3:
                this.armadura = "Creando armadura para humano 3";
                break;
        }

    }

    @Override
    public String operacion() {
        return this.armadura;
    }
  
    
}