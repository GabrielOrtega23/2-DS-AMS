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
public class Menucalculadora extends JFrame {
     //botoes
      JButton soma, subtracao, multiplicacao, divisao, raiz;
      JLabel titulo;
 
      //construtor
      public Menucalculadora(){
          super("Calculadora");
          Container tela = getContentPane();
          //fundo branco
          tela.setBackground(Color.WHITE);
          setLayout(null);
          
          titulo = new JLabel ("Calculadora");
          
          soma = new JButton ("Soma");
          subtracao = new JButton ("Subtração");
          multiplicacao = new JButton ("Multiplicação");
          divisao = new JButton ("Divisão");
          raiz = new JButton ("Raiz");
          
          //Cria fonte Geneva em tipo Font
          Font fonte = new Font("Geneva", Font.BOLD, 14);

          titulo.setFont(new Font("Geneva", Font.BOLD, 20));
          
          // estabelecendo fonte em todos os botoes
          soma.setFont(fonte);
          subtracao.setFont(fonte);
          multiplicacao.setFont(fonte);
          divisao.setFont(fonte);
          raiz.setFont(fonte);
          
         //mudando as cores do fundo do botão para azul
          soma.setBackground(new Color(100, 149, 237));
          subtracao.setBackground(new Color(100, 149, 237));
          multiplicacao.setBackground(new Color(100, 149, 237));
          divisao.setBackground(new Color(100, 149, 237));
          raiz.setBackground(new Color(100, 149, 237));
          
          //cor das letras do botao
          soma.setForeground(Color.WHITE);
          subtracao.setForeground(Color.WHITE);
          multiplicacao.setForeground(Color.WHITE);
          divisao.setForeground(Color.WHITE);
          raiz.setForeground(Color.WHITE);            
         
          //posições
          titulo.setBounds(145, 10, 200, 20);
          soma.setBounds(100,50,200, 30);
          subtracao.setBounds(100,90,200, 30);
          multiplicacao.setBounds(100,130,200, 30);
          divisao.setBounds(100,170,200, 30);
          raiz.setBounds(100,210,200, 30);
          
         // Adiciona uma ação no botao soma 
         soma.addActionListener(
         new ActionListener() {
             
             //metodo executado ao apertar o botao
               public void actionPerformed(ActionEvent e){
                   //Cria objeto da classe soma
                    Soma soma1 = new Soma();
                    //executa janela da soma
                    soma1.executarsoma();
               } 
         });
         
          // Adiciona uma ação no botao subtracao
          subtracao.addActionListener(
         new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    //Cria objeto da classe subtração
                  Subtração subtracao1 = new Subtração();
                  //executa janela da subtração
                   subtracao1.executarsubtracao();
               } 
         });
          // Adiciona uma ação no botao multiplicação
          multiplicacao.addActionListener(
         new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    //Cria objeto da classe multiplicação
                   Multiplicação multiplicacao1 = new Multiplicação();
                    //executa janela da multiplicação
                   multiplicacao1.executarmultiplicacao();
               } 
         });
          // Adiciona uma ação no botao divisao
          divisao.addActionListener(
         new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    //Cria objeto da classe divisao
                    Divisão divisao1 = new Divisão();
                     //executa janela da divisao
                   divisao1.executardivisao();
               } 
         });
          // Adiciona uma ação no botao Raiz
          raiz.addActionListener(
         new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    //Cria objeto da classe Raiz
                    Raiz raiz1 = new Raiz();
                     //executa janela da raiz
                   raiz1.executarraiz();
               } 
         });
          
         
          tela.add(titulo);
          tela.add(soma);
          tela.add(subtracao);
          tela.add(multiplicacao);
          tela.add(divisao);
          tela.add(raiz);
          
        setSize(400,300);
        setVisible(true);
        setLocationRelativeTo(null);
      }
      
}