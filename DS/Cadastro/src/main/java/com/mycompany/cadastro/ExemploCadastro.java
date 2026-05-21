/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

/**
 *
 * @author gabrielortega
 */
import javax.swing.*;
import java.awt.*;

public class ExemploCadastro extends JFrame  {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, cadastroL;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
 
    
    public ExemploCadastro() {
        super ("Cadastro do Cliente");
        Container tela = getContentPane();
        setLayout(null);
        
        cadastroL = new JLabel ("Cadastro de Cliente");
        cadastroL.setBounds(130, 0, 200, 20);
        cadastroL.setForeground(Color.red);
        
        
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("CPF");
        rotulo3 = new JLabel ("RG");
        rotulo4 = new JLabel ("Endereço");
        rotulo5 = new JLabel ("Cidade");
        rotulo6 = new JLabel ("Estado");
        rotulo7 = new JLabel ("CEP");
        
        texto1 = new JTextField(50);
        texto2 = new JTextField(13);
        texto3 = new JTextField(13);
        texto4 = new JTextField(50);
        texto5 = new JTextField(30);
        texto6 = new JTextField(20);
        texto7 = new JTextField(14);
        //coluna, linha, largura, comprimento
        rotulo1.setBounds(50, 40, 80, 20);
        rotulo2.setBounds(50, 80, 80, 20);
        rotulo3.setBounds(50, 120, 80, 20);
        rotulo4.setBounds(50, 160, 80, 20);
        rotulo5.setBounds(50, 200, 80, 20);
        rotulo6.setBounds(50, 240, 80, 20);
        rotulo7.setBounds(50, 280, 80, 20);
       
        texto1.setBounds(110, 40, 200, 20);
        texto2.setBounds(110, 80, 140, 20);
        texto3.setBounds(110, 120, 120, 20);
        texto4.setBounds(110, 160, 200, 20);
        texto5.setBounds(110, 200, 180, 20);
        texto6.setBounds(110, 240, 160, 20);
        texto7.setBounds(110, 280, 120, 20);
        
        tela.add(cadastroL);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        
         
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
}
