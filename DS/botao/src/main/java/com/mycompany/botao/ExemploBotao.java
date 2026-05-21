/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botao;

/**
 *
 * @author Admin
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ExemploBotao extends JFrame {
    JButton botao1, botao2, botao3;
    ImageIcon icone;
    
    public ExemploBotao(){
        super ("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        
        icone = new ImageIcon("folder.gif");
        
        botao1 = new JButton ("Procurar");
        botao2 = new JButton ("Abrir", icone);
        botao3 = new JButton (icone);
        
        botao1.setBounds(140, 50, 100, 20);
        botao2.setBounds(140, 100, 100, 20);
        botao3.setBounds(140, 150, 100, 20);
        
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        
        setSize(400,250);
        setVisible(true);
    }
    
}
