/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta.personajes;

import fabricaAbstracta.equipamientopersonajes.Armaduras;
import fabricaAbstracta.equipamientopersonajes.Armaduras_enano;
import fabricaAbstracta.equipamientopersonajes.Armas;
import fabricaAbstracta.equipamientopersonajes.Armas_enano;
import fabricaAbstracta.equipamientopersonajes.Escudos;
import fabricaAbstracta.equipamientopersonajes.Escudos_enano;
import fabricaAbstracta.equipamientopersonajes.Monturas;
import fabricaAbstracta.equipamientopersonajes.Monturas_enano;

/**
 *
 * @author Álvaro
 */
public class FabricaEnanos implements FabricaAbstracta_personajes {

    @Override
    public Escudos crearEscudo() {
        return new Escudos_enano();
    }

    @Override
    public Armaduras crearArmadura() {
        return new Armaduras_enano();
    }

    @Override
    public Armas crearArma() {
        return new Armas_enano();
    }

    @Override
    public Monturas crearMontura() {
        return new Monturas_enano();
    }

}
