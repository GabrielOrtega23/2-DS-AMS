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
public class Quadrado {
     Scanner scanner = new Scanner(System.in);
     double base;
    double altura;
    double calculoquadrado;

     double quadrado() {
         System.out.print("Digite a base do quadrado: ");
        base = scanner.nextDouble();
        System.out.print("Digite a altura do quadrado: ");
        altura = scanner.nextDouble();
       return calculoquadrado = (base * altura);
        //return calculoquadrado;
    
    
}
}
