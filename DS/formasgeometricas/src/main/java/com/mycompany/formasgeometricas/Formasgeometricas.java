/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formasgeometricas;

/**
 *
 * @author gabrielortega
 */
public class Formasgeometricas {

    public static void main(String[] args) {
        Circulo c = new Circulo();
       System.out.println("Área do círculo: " + c.circulo());
        
        Triangulo t = new Triangulo();
        System.out.println("Área do triangulo: " + t.triangulo());
        
        Quadrado q = new Quadrado();
        System.out.println("Área do quadrado: " + q.quadrado());
        
    }
}
