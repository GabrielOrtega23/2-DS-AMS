/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro2;

/**
 *
 * @author Admin
 */
public class Carro {
    String cor;
    String modelo;
    String motor;
    
    void ligar() {
        System.out.println("Ligando");
    }
    void freiar() {
        System.out.println("Freiando");
    }
     void acelerar() {
        System.out.println("Acelerando");   
     }
     void desligar() {
        System.out.println("Desligando");   
     }
     void mudarmarcha() {
          System.out.println("mudando marcha");  
     }
    void Modelo() {
    System.out.println("Modelo do carro: " + modelo);
}
    void Cor() {
        System.out.println("Cor do carro: " + cor);
        
    }
    void Motor() {
        System.out.println("Motor do Carro: " + motor);
    }
     
}
