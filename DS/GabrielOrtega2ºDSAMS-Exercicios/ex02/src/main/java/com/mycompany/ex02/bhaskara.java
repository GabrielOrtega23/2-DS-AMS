/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex02;

/**
 *
 * @author gabrielortega
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class bhaskara extends JFrame {
     //label
   JLabel rotulo1, rotulo2, rotulo3, resultado1, resultado2;
    //textfields
    JTextField texto1, texto2, texto3;
     //botao
    JButton calcular;
    
    public bhaskara(){
        
        Container tela = getContentPane();
        //fundo branco
        tela.setBackground(Color.WHITE);
        setLayout(null);
        
         rotulo1= new JLabel ("a: ");
        rotulo2 = new JLabel ("b: ");
        rotulo3= new JLabel ("c: ");
       
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
      
        resultado1 = new JLabel ("");
        resultado2 = new JLabel("");
        
         calcular = new JButton ("Calcular");
         // define posições
        rotulo1.setBounds(100,20,100,20);
        rotulo2.setBounds(100,60,100,20);
        rotulo3.setBounds(100,100,100,20);
        
        
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        texto3.setBounds(120,100,200,20);
        
        
        resultado1.setBounds(50,130,200, 20);
        resultado2.setBounds(50,160,200, 20);
        
        calcular.setBounds(150, 190, 100, 20);
        
         
          calcular.addActionListener(
         new ActionListener() {
             //metodo executado quando o botao é clicado
             public void actionPerformed(ActionEvent e){
                 //cria variaveis double
                 double numero1, numero2,numero3, delta, x1, x2;
                 
                   numero1 = Double.parseDouble(texto1.getText());
                numero2 = Double.parseDouble(texto2.getText());
                numero3 = Double.parseDouble(texto3.getText());
                
                delta = (numero2 * numero2) - (4 * numero1 * numero3);
                 if (delta >= 0){
               
                 x1 = (-numero2 + Math.sqrt(delta)) / (2 * numero1);
                 x2 = (-numero2 - Math.sqrt(delta)) / (2 * numero1);
                 
                 resultado1.setVisible(true);
                 resultado1.setText("x1: " +x1);
                 resultado2.setVisible(true);
                 resultado2.setText("x2: " +x2);
                 }
                 else {
                 resultado1.setVisible(true);
                 resultado1.setText("Não existem raízes reais");
}
                 
             }
         }
        );
        resultado1.setVisible(false);
        resultado2.setVisible(false);
         
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(resultado1);
        tela.add(resultado2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(calcular);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    }



