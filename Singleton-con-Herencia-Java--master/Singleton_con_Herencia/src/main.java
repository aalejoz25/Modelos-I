/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Los Pinitos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SingletonPadre obj = SingletonHija.getInstance();
        SingletonPadre obj2 = SingletonHija.getInstance();
        System.out.println("Se han creado dos objetos de la clase SingletonHija");

        SingletonPadre obj3 = SingletonPadre.getInstance();
        SingletonPadre obj4 = SingletonPadre.getInstance();
        System.out.println("Se han creado dos objetos de la clase SingletonPadre \n ");

        System.out.println("Comparacion objetos SingletonHija: " + obj.equals(obj2) + "\nComparacion objetos SingletonPadre: " + obj3.equals(obj4) + "\nComparacion objetos SingletonPadre y SingletonHija: " + obj.equals(obj3));
    }

}
