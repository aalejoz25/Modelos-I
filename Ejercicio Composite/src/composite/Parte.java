/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Álvaro
 */
public class Parte implements Circulo {

    String tipo;

    public Parte(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void dibujarCirculo(Graphics lapiz, int posx, int posy) {
        lapiz.setColor(Color.black);
        if (tipo.equals("cabeza")) {
            posx = 25;
            posy = 25;

            lapiz.drawOval(posx, posy, 150, 150);

        } else if (tipo.equals("orejaizquierda")) {
            posx = 0;
            posy = 10;

            lapiz.drawOval(posx, posy, 50, 50);
        } else if (tipo.equals("orejaizquierdainterna")) {
            posx = 20;
            posy = 30;

            lapiz.drawOval(posx, posy, 25, 25);
        } else if (tipo.equals("orejaderecha")) {
            posx = 150;
            posy = 10;

            lapiz.drawOval(posx, posy, 50, 50);
        } else if (tipo.equals("orejaderechainterna")) {
            posx = 155;
            posy = 30;

            lapiz.drawOval(posx, posy, 25, 25);
        } else if (tipo.equals("ojoizquierdo")) {
            posx = 50;
            posy = 50;

            lapiz.drawOval(posx, posy, 50, 50);
        } else if (tipo.equals("pupilaizquierda")) {
            posx = 72;
            posy = 72;

            lapiz.setColor(Color.black);
            lapiz.fillOval(posx, posy, 25, 25);
        } else if (tipo.equals("ojoderecho")) {

            posx = 100;
            posy = 50;

            lapiz.drawOval(posx, posy, 50, 50);
        } else if (tipo.equals("pupiladerecha")) {

            posx = 104;
            posy = 72;

            lapiz.setColor(Color.black);
            lapiz.fillOval(posx, posy, 25, 25);
        } else if (tipo.equals("nariz")) {
            posx = 75;
            posy = 95;

            lapiz.drawOval(posx, posy, 50, 50);
        } else if (tipo.equals("rellenonariz")) {
            posx = 88;
            posy = 112;

            lapiz.setColor(Color.black);
            lapiz.fillOval(posx, posy, 25, 25);
        }
    }

}
