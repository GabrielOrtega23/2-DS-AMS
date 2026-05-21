/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex05;

/**
 *
 * @author gabrielortega
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class imc extends JFrame {
      //label
   JLabel rotulo1, rotulo2, resultado1;
    //textfields
    JTextField texto1, texto2;
     //botao
    JButton Calcular;
    
    public imc(){
        
        Container tela = getContentPane();
        //fundo branco
        tela.setBackground(Color.WHITE);
        setLayout(null);
        
         rotulo1= new JLabel ("Peso: ");
        rotulo2 = new JLabel ("Altura: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        resultado1 = new JLabel ("");
         Calcular = new JButton ("Calcular");
         // define posições
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        
        resultado1.setBounds(50,140,200, 20);
        Calcular.setBounds(150, 100, 120, 20);
        
          //adiciona uma ação ao botao
          Calcular.addActionListener(
         new ActionListener() {
             //metodo executado quando o botao é clicado
             public void actionPerformed(ActionEvent e){
                 //cria variaveis double
                 double numero1, numero2, imc;
                 imc = 0;
                
                 //pega o texto digitado em texto1 e texto2, e converte em double
                numero1 = Double.parseDouble(texto1.getText());
                numero2 = Double.parseDouble(texto2.getText());
                   // faz a operação
                 imc = numero1 / (numero2 * numero2);
                 
                 if(imc < 18) {
                     resultado1.setVisible(true);
                 resultado1.setText("Você está abaixo do peso " +imc);
                 }
                 
                   if(imc >= 18.5 && imc <= 24.99) {
                     resultado1.setVisible(true);
                 resultado1.setText("Você está no peso ideal " +imc);
                 }
                    if(imc > 25) {
                     resultado1.setVisible(true);
                 resultado1.setText("Você está acima do peso " +imc);
                 }
             }
         }
        );
        resultado1.setVisible(false);
         
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(resultado1);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(Calcular);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    }