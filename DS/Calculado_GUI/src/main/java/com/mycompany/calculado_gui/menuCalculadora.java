/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculado_gui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class menuCalculadora {
    // declara as variaves
    private Calculadora calculadora;
    private int opçao; 
    private ConversorNumeros conversor;
    private EntradaSaidaDados io; 
    
   public menuCalculadora() {
     this.calculadora = new Calculadora();
     this.opçao = -1;
     this.conversor = new ConversorNumeros();
     this.io = new EntradaSaidaDados();  
   }
  
   public void executarCalculadora () {
   do {
   this.executarMenuPrincipal();
   this.avaliarOpçaoEscolida();
   } while (this.opçao !=0);
   }
    // atribui as letras para da GUI
   private void executarMenuPrincipal() {
   String mensagemMenu = "selecione uma opção"
           + "\n 1  - somar"
           + "\n 2  - subtrair"   
           + "\n 3 - multiplicar"
           + "\n 4 - dividir"
           + "\n 5 - sair ";
           
           
         String entradaDados = io.entradaDados(mensagemMenu);
         this.opçao = conversor.StringToInt (entradaDados);
           }
   
   // analisa a opção que o usuario escolheu
   public void avaliarOpçaoEscolida () {
   String saida;
   double num1=0, num2 = 0; 
   if(this.opçao !=0 && this.opçao<=4) {
   String mensagemEntrada = "Digite o 1° numero";
   num1 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
   calculadora.setNumero1(num1);
   mensagemEntrada = "Digite o 2° Numero";
   num2 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
           calculadora.setNumero2(num2);   
   }
  switch (this.opçao){
      case 1:
      calculadora.somar(num1,num2);
             saida="Resultado da soma " + calculadora.getResultado();
             io.saidaDados(saida);
             break;
      case 2:
          calculadora.subtrair(num1, num2);
          saida = "Resultado da subtração" + calculadora.getResultado();
          io.saidaDados(saida);
          break;
      case 3: calculadora.multiplicar(num1, num2);
      saida = "Resultado da multiplicação" + calculadora.getResultado();
      io.saidaDados(saida);
      
      case 4: calculadora.dividir(num1, num2); 
      saida = "Resuldado da divisão" + calculadora.getNumero1();
      io.saidaDados(saida);
        break; 
        
      case 5: calculadora.sair();
      default:
       io.saidaDados("opção invalida");
       break;
             
             
  
  
  }
   
   
   }
            
   
    
    
    
}
