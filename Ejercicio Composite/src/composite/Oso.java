/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class Oso implements Circulo {

    ArrayList<Circulo> partes = new ArrayList<Circulo>();

    int posXCabeza = 0;
    int posYCabeza = 0;

    @Override
    public void dibujarCirculo(Graphics lapiz, int posx, int posy) {
        lapiz.setColor(Color.white);
        lapiz.fillRect(0, 0, 200, 200);

        for (int i = 0; i < partes.size(); i++) {
            partes.get(i).dibujarCirculo(lapiz, posx, posy);
        }
    }
    
     public void addPart(Circulo c){
        partes.add(c);
    }

}
