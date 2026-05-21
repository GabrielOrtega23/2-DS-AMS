/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopitagoras;
import java.util.Scanner;
/**
 *
 * @author gabrielortega
 */

public class pitagoras {
    Scanner scanner = new Scanner(System.in);
    double cateto1;
    double cateto2;
    double calculohipotenusa;
    
     double pitagoras() {
        System.out.println("Calculando a hipotenusa");
    System.out.print("Digite o valor do primeiro cateto: ");
    cateto1 = scanner.nextDouble();
    System.out.print("Digite o valor do segundo cateto: ");
    cateto2 = scanner.nextDouble();
    
    return calculohipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
            
    }
    
}
