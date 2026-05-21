/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversortemperatura2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class kelvinparacelsius {
    double kelvin;
    double calculokelvin;
    
    double kelvinc() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a temperatura em Kelvin: ");
    
    kelvin = scanner.nextDouble();
    
   return calculokelvin = kelvin - 273.15;
    
    }
    
}
