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
public class Escudos_orco implements Escudos {

    private String escudo;

    @Override
    public void opcion(int opcion) {
        switch (opcion) {
            case 1:
                this.escudo = "Creando escudo para orco 1";
                break;
            case 2:
                this.escudo = "Creando escudo para orco 2";
                break;
            case 3:
                this.escudo = "Creando escudo para orco 3";
                break;
        }

    }

    @Override
    public String operacion() {
        return this.escudo;
    }

}
