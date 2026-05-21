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
public class EntradaSaidaDados {
    
    // recebe e retorna valores
    public String entradaDados (String mensagemEntrada) {
    return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
    public void saidaDados (String mensagemSaida) {
    JOptionPane.showMessageDialog(null, mensagemSaida) ;
    }
    
}
