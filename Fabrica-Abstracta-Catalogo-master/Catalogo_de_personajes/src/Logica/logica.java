/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import fabricaAbstracta.equipamientopersonajes.Armaduras;
import fabricaAbstracta.equipamientopersonajes.Armas;
import fabricaAbstracta.equipamientopersonajes.Escudos;
import fabricaAbstracta.equipamientopersonajes.Monturas;
import fabricaAbstracta.personajes.FabricaAbstracta_personajes;
import fabricaAbstracta.personajes.FabricaEnanos;
import fabricaAbstracta.personajes.FabricaHumanos;
import fabricaAbstracta.personajes.FabricaOrcos;
import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class logica {

    FabricaAbstracta_personajes fabrica;
    Armaduras armadura;
    Armas arma;
    Escudos escudo;
    Monturas montura;
    Scanner escaner;
    int opcion = 0;

    public void operacion() {
        escaner = new Scanner(System.in);

        do {
            System.out.println("Ingrese 1 para Enanos, 2 para Humanos o 3 para Orcos");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);

        switch (opcion) {
            case 1:
                fabrica = new FabricaEnanos();
                break;
            case 2:
                fabrica = new FabricaHumanos();
                break;
            case 3:
                fabrica = new FabricaOrcos();
                break;
        }

        arma = fabrica.crearArma();
        armadura = fabrica.crearArmadura();
        escudo = fabrica.crearEscudo();
        montura = fabrica.crearMontura();

        do {
            System.out.println("Ingrese 1 para Arma1, 2 para Arma2 o 3 para Arma3");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);
        arma.opcion(this.opcion);
        System.out.println(arma.operacion());

        do {
            System.out.println("Ingrese 1 para Armadura1, 2 para Armadura2 o 3 para Armadura3");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);
        armadura.opcion(this.opcion);
        System.out.println(armadura.operacion());

        do {
            System.out.println("Ingrese 1 para Escudo1, 2 para Escudo2 o 3 para Escudo3");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);
        escudo.opcion(this.opcion);
        System.out.println(escudo.operacion());

        do {
            System.out.println("Ingrese 1 para Montura1, 2 para Montura2 o 3 para Montura3");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);
        montura.opcion(this.opcion);
        System.out.println(montura.operacion());
        
        System.exit(0);
    }
}

