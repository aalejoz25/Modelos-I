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
public class Armas_humano implements Armas {

    private String arma;

    @Override
    public void opcion(int opcion) {
        switch (opcion) {
            case 1:
                this.arma = "Creando arma para humano 1";
                break;
            case 2:
                this.arma = "Creando arma para humano 2";
                break;
            case 3:
                this.arma = "Creando arma para humano 3";
                break;
        }

    }

    @Override
    public String operacion() {
        return this.arma;
    }

}
