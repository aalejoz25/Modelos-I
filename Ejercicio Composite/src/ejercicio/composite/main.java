/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.composite;

import composite.Oso;
import java.awt.Graphics;
import vista.Vista;

/**
 *
 * @author Álvaro
 */
public class main {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Vista().setVisible(true);            
        });
    }

}
