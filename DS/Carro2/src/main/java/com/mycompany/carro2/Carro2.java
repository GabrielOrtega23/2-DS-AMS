/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro2;

/**
 *
 * @author Admin
 */
public class Carro2 {

    public static void main(String[] args) {
       Carro exemplocarro = new Carro();
       exemplocarro.cor = "Vermelho";
        exemplocarro.modelo = "Gol";
        exemplocarro.motor = "2.0";
       
        
       exemplocarro.acelerar();
       exemplocarro.mudarmarcha();
       exemplocarro.freiar();
       exemplocarro.ligar();
       exemplocarro.desligar();
       exemplocarro.Cor();
       exemplocarro.Modelo();
       exemplocarro.Motor();
    }
}
