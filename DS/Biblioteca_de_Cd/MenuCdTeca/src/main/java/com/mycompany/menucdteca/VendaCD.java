/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucdteca;

/**
 *
 * @author Admin
 */
public class VendaCD {
    // encapsula
    private double valorcd;
   
    public void calcularPrecoVenda (Cdteca p){
        // faz a conta de porcentagrem
        valorcd = p.getpreco() + (p.getpreco() * p.getpercentual() / 100);
    }
// acessa de maneira segura o que esta encapsulado
public double getvalorcd() {
  return this.valorcd; 
}
}
