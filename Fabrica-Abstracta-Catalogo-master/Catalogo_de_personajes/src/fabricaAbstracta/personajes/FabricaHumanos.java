/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta.personajes;

import fabricaAbstracta.equipamientopersonajes.Armaduras;
import fabricaAbstracta.equipamientopersonajes.Armaduras_humano;
import fabricaAbstracta.equipamientopersonajes.Armas;
import fabricaAbstracta.equipamientopersonajes.Armas_humano;
import fabricaAbstracta.equipamientopersonajes.Escudos;
import fabricaAbstracta.equipamientopersonajes.Escudos_humano;
import fabricaAbstracta.equipamientopersonajes.Monturas;
import fabricaAbstracta.equipamientopersonajes.Monturas_humano;

/**
 *
 * @author Álvaro
 */
public class FabricaHumanos implements FabricaAbstracta_personajes {

  @Override
    public Escudos crearEscudo() {
        return new Escudos_humano();
    }

    @Override
    public Armaduras crearArmadura() {
        return new Armaduras_humano();
    }

    @Override
    public Armas crearArma() {
        return new Armas_humano();
    }

    @Override
    public Monturas crearMontura() {
        return new Monturas_humano();
    }
}
