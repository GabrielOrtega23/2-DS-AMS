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
public class Raiz extends JFrame {
    //label
    JLabel rotulo1, rotulo2, resultado1, resultado2;
    //textfields
    JTextField texto1, texto2;
    //botao
    JButton Raiz;
    
    public void executarraiz(){
         Container tela = getContentPane();
         //fundo branco
         tela.setBackground(Color.WHITE);
        setLayout(null);
        
         rotulo1= new JLabel ("1º número: ");
        rotulo2 = new JLabel ("2º número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        resultado1 = new JLabel ("");
        resultado2 = new JLabel("");
        Raiz = new JButton ("Raiz");
         // define posições
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        
        resultado1.setBounds(50,120,200, 20);
        resultado2.setBounds(50, 150, 350, 20);
              
        Raiz.setBounds(150, 100, 80, 20);
         //cria fonte Geneva do tipo Font
        Font fonte = new Font("Geneva", Font.BOLD, 14);

        rotulo1.setFont(fonte);
        rotulo2.setFont(fonte);
        resultado1.setFont(fonte);
        resultado2.setFont(fonte);

        Raiz.setFont(fonte);

        Raiz.setBackground(new Color(100, 149, 237));

        Raiz.setForeground(Color.WHITE);
          //adiciona uma ação ao botao
          Raiz.addActionListener(
         new ActionListener() {
             //metodo executado quando o botao é clicado
             public void actionPerformed(ActionEvent e){
                 //cria variaveis double
                 double numero1, numero2, soma;
                 double raiz;
                 soma = 0;
                 raiz = 0;
                
                 //pega o texto digitado em texto1 e texto2, e converte em double
                numero1 = Double.parseDouble(texto1.getText());
                numero2 = Double.parseDouble(texto2.getText());
                   // faz a operação
                 soma = numero1 + numero2;
                 raiz = Math.sqrt(soma);
                 
                 resultado1.setVisible(true);
                 resultado1.setText("A soma é " +soma);
                 
                 resultado2.setVisible(true);
                 resultado2.setText("A raiz da soma dos números é  " +raiz);
                 
                 
             }
         }
        );
        resultado1.setVisible(false);
        resultado2.setVisible(false);
         
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(resultado1);
        tela.add(resultado2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(Raiz);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
