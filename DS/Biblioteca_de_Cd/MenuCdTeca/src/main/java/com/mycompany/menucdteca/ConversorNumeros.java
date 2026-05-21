/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucdteca;

/**
 *
 * @author Admin
 */
public class ConversorNumeros {
    //converte String para Inteiro
     public Integer StringToInt(String numero) {
    int conversor = Integer.parseInt(numero);
    // retorna a variavel conversor como int 
    return (conversor);
    }
    
      // converte String para double 
    public Double stringToDouble (String numero) {
    double conversor = Double.parseDouble(numero);
    return (conversor);
}
}