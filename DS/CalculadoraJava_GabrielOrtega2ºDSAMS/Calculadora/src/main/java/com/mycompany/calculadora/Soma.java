/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author gabrielortega
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//Classe que herda caracteristicas da classe JFrame
public class Soma extends JFrame {
    //label
   JLabel rotulo1, rotulo2, resultado1;
    //textfields
    JTextField texto1, texto2;
     //botao
    JButton Somar;
    
    public void executarsoma(){
        
        Container tela = getContentPane();
        //fundo branco
        tela.setBackground(Color.WHITE);
        setLayout(null);
        
         rotulo1= new JLabel ("1º número: ");
        rotulo2 = new JLabel ("2º número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        resultado1 = new JLabel ("");
         Somar = new JButton ("Somar");
         // define posições
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        
        resultado1.setBounds(50,120,200, 20);
        Somar.setBounds(150, 100, 80, 20);
         //cria fonte Geneva do tipo Font
        Font fonte = new Font("Geneva", Font.BOLD, 14);

        rotulo1.setFont(fonte);
        rotulo2.setFont(fonte);
        resultado1.setFont(fonte);

        Somar.setFont(fonte);

        Somar.setBackground(new Color(100, 149, 237));

        Somar.setForeground(Color.WHITE);
          //adiciona uma ação ao botao
          Somar.addActionListener(
         new ActionListener() {
             //metodo executado quando o botao é clicado
             public void actionPerformed(ActionEvent e){
                 //cria variaveis double
                 double numero1, numero2, soma;
                 soma = 0;
                
                 //pega o texto digitado em texto1 e texto2, e converte em double
                numero1 = Double.parseDouble(texto1.getText());
                numero2 = Double.parseDouble(texto2.getText());
                   // faz a operação
                 soma = numero1 + numero2;
                 resultado1.setVisible(true);
                 resultado1.setText("A soma é " +soma);
                 
                 
             }
         }
        );
        resultado1.setVisible(false);
         
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(resultado1);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(Somar);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    }
