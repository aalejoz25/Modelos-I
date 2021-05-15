/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta.personajes;

import fabricaAbstracta.equipamientopersonajes.Armaduras;
import fabricaAbstracta.equipamientopersonajes.Armas;
import fabricaAbstracta.equipamientopersonajes.Escudos;
import fabricaAbstracta.equipamientopersonajes.Monturas;

/**
 *
 * @author Álvaro
 */
public interface FabricaAbstracta_personajes {
    
    public Escudos crearEscudo();
    
    public Armaduras crearArmadura();
    
    public Armas crearArma();
    
    public Monturas crearMontura();
    
}
