/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucdteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
// Recebe uma entrada do tipo String digitada pelo usuario
public class EntradaSaidaDados {
    // no diagrama estava void, mas não funciona como void só string 
      public String entradaDados (String mensagemEntrada) {
     return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
      // mostra uma saida definida no codigo obs : não retorna nada 
    public void saidaDados (String mensagemSaida) {
    JOptionPane.showMessageDialog(null, mensagemSaida) ;
}
}