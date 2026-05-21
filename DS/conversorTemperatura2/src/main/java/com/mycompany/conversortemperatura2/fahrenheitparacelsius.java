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
public class fahrenheitparacelsius {
    double fahrenheit;
    double calculofahrenheit1;
    
    double fahrenheitc() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a temperatura em Fahrenheit: ");
    fahrenheit = scanner.nextDouble();
    return calculofahrenheit1 = (fahrenheit - 32) / 1.8;
    
}
}
