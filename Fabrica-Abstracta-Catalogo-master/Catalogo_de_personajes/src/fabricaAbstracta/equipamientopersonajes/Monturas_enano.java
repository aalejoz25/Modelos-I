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
public class Monturas_enano implements Monturas {

    private String montura;

    @Override
    public void opcion(int opcion) {
        switch (opcion) {
            case 1:
                this.montura = "Creando montura para enano 1";
                break;
            case 2:
                this.montura = "Creando montura para enano 2";
                break;
            case 3:
                this.montura = "Creando montura para enano 3";
                break;
        }

    }

    @Override
    public String operacion() {
        return this.montura;
    }

}
