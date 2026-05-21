/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocilindro;
import javax.swing.JOptionPane;
/**
 *
 * @author gabrielortega
 */
public class cilindro {
    double areaLateral;
    double volume;
    double calculoarea;
    double calculovolume;
    double raio;
    double altura;
    
    double cilindro() {
        raio = Double.parseDouble(
         JOptionPane.showInputDialog("Digite o raio do cilindro:"));
        
        altura = Double.parseDouble(
          JOptionPane.showInputDialog("Digite a altura:"));
         
        return calculoarea = 2 * Math.PI * raio * altura;
      
    }
    double cilindro1() {
        return calculovolume = Math.PI * raio * raio * altura;
    }
    }

