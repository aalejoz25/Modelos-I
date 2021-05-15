/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta.personajes;

import fabricaAbstracta.equipamientopersonajes.Armaduras;
import fabricaAbstracta.equipamientopersonajes.Armaduras_orco;
import fabricaAbstracta.equipamientopersonajes.Armas;
import fabricaAbstracta.equipamientopersonajes.Armas_orco;
import fabricaAbstracta.equipamientopersonajes.Escudos;
import fabricaAbstracta.equipamientopersonajes.Escudos_orco;
import fabricaAbstracta.equipamientopersonajes.Monturas;
import fabricaAbstracta.equipamientopersonajes.Monturas_orco;



/**
 *
 * @author Álvaro
 */
public class FabricaOrcos implements FabricaAbstracta_personajes {

      @Override
    public Escudos crearEscudo() {
        return new Escudos_orco();
    }

    @Override
    public Armaduras crearArmadura() {
        return new Armaduras_orco();
    }

    @Override
    public Armas crearArma() {
        return new Armas_orco();
    }

    @Override
    public Monturas crearMontura() {
        return new Monturas_orco();
    }
    
    
}

