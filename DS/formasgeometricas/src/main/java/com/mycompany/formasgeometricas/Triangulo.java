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
public class Triangulo {
     Scanner scanner = new Scanner(System.in);
      double base;
    double altura;
    double calculotriangulo;

    double triangulo() {
        System.out.print("Digite a base do triangulo: " );
        base = scanner.nextDouble();
        System.out.print("Digite a altura do triangulo: ");
        altura = scanner.nextDouble();
       return calculotriangulo = (base * altura) / 2;
      // return calculotriangulo;
    
}
}