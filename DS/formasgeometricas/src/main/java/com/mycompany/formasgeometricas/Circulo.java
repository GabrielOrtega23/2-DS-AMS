/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formasgeometricas;
import java.util.Scanner;
/**
 *
 * @author gabrielortega
 */
public class Circulo {
    Scanner scanner = new Scanner(System.in);
     double calculocirculo;
     double raio;
     
     double circulo() {
        System.out.print("Digite o raio do circulo: ");
        raio = scanner.nextDouble();
        return calculocirculo = Math.PI * (raio * raio);
       //return calculocirculo;
    
}
}
