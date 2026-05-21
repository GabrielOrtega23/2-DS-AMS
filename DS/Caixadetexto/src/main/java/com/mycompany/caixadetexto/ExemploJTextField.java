/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixadetexto;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;

public class ExemploJTextField extends JFrame {
    
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;

    public ExemploJTextField(){

        super("Exemplo com JTextField");

        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        rotulo5 = new JLabel ("Altura em cm");
        rotulo6 = new JLabel ("Peso");
        rotulo7 = new JLabel ("Calçado");
        
        texto1 = new JTextField (40);
        texto2 = new JTextField (3);
        texto3 = new JTextField (10);
        texto4 = new JTextField (10);
        texto5 = new JTextField (3);
        texto6 = new JTextField (3);
        texto7 = new JTextField (2);
        
        rotulo1.setBounds(50, 20, 80, 20);
        texto1.setBounds(140, 20, 200, 20);

        rotulo2.setBounds(50, 50, 80, 20);
        texto2.setBounds(140, 50, 40, 20);

        rotulo3.setBounds(50, 80, 80, 20);
        texto3.setBounds(140, 80, 100, 20);

        rotulo4.setBounds(50, 110, 80, 20);
        texto4.setBounds(140, 110, 100, 20);

        rotulo5.setBounds(50, 140, 80, 20);
        texto5.setBounds(140, 140, 40, 20);

        rotulo6.setBounds(50, 170, 80, 20);
        texto6.setBounds(140, 170, 40, 20);

        rotulo7.setBounds(50, 200, 80, 20);
        texto7.setBounds(140, 200, 40, 20);
        
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
        
        setSize(400, 250);
        setVisible(true);
        
        setLocationRelativeTo(null);
        
        
    }
    
}
