/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex04;

/**
 *
 * @author gabrielortega
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class triangulo extends JFrame {
     //label
   JLabel rotulo1, rotulo2, rotulo3, resultado1;
    //textfields
    JTextField texto1, texto2, texto3;
     //botao
    JButton Calcular;
    
    public triangulo(){
        
        Container tela = getContentPane();
        //fundo branco
        tela.setBackground(Color.WHITE);
        setLayout(null);
        
         rotulo1= new JLabel ("1º número: ");
        rotulo2 = new JLabel ("2º número: ");
        rotulo3= new JLabel ("3º número: ");
        
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        resultado1 = new JLabel ("");
         Calcular = new JButton ("Calcular");
         // define posições
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        rotulo3.setBounds(50,100,100,20);
       
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        texto3.setBounds(120,100,200,20);
        
        
        resultado1.setBounds(50,140,200, 20);
        Calcular.setBounds(150, 170, 80, 20);
        
         
          Calcular.addActionListener(
         new ActionListener() {
             //metodo executado quando o botao é clicado
             public void actionPerformed(ActionEvent e){
                 //cria variaveis double
                 double numero1, numero2,numero3;
                 
                 //pega o texto digitado em texto1 e texto2, e converte em double
                numero1 = Double.parseDouble(texto1.getText());
                numero2 = Double.parseDouble(texto2.getText());
                numero3 = Double.parseDouble(texto3.getText());
                
                if (numero1 == numero2 && numero1 == numero3){
                    resultado1.setVisible(true);
                    resultado1.setText("Triângulo Equilátero ");
                }
                 if (numero1 == numero2 && numero1 != numero3 ){
                     resultado1.setVisible(true);
                    resultado1.setText("Triângulo Isósceles ");
                 }
                 if (numero1 == numero3 && numero1 != numero2 ){
                     resultado1.setVisible(true);
                    resultado1.setText("Triângulo Isósceles ");
                 }
                 if (numero2 == numero3 &&  numero2 != numero1 ){
                     resultado1.setVisible(true);
                    resultado1.setText("Triângulo Isósceles ");
                 }
                 
                 if (numero1 != numero2 && numero1!= numero3 && numero2 != numero3){
                 resultado1.setVisible(true);
                 resultado1.setText("Triângulo Escaleno ");
                 
                 }
             }
         }
        );
        resultado1.setVisible(false);
         
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(resultado1);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(Calcular);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    }

