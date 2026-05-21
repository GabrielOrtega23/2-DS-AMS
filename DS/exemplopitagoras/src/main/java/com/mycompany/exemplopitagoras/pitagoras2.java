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
public class pitagoras2 {
    Scanner scanner = new Scanner(System.in);
    double cateto;
    double hipotenusa;
    double calculo;
    double calculofinal;
    
     double pitagoras2() {
        System.out.println("Calculando o valor do outro cateto");
    System.out.print("Digite o valor do cateto: ");
    cateto = scanner.nextDouble();
    System.out.print("Digite o valor da hipotenusa: ");
    hipotenusa = scanner.nextDouble();
     calculo = (hipotenusa * hipotenusa) - (cateto * cateto);
     return calculofinal = Math.sqrt(calculo);
            
            }
}
