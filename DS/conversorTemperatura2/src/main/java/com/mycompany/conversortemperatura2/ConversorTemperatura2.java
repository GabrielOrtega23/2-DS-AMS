/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversortemperatura2;

/**
 *
 * @author Admin
 */
public class ConversorTemperatura2 {

    public static void main(String[] args) {
      fahrenheitparacelsius fc = new fahrenheitparacelsius();
      
      System.out.println("Fahrenheint em Celsius: " + fc.fahrenheitc());
      kelvinparacelsius kc = new kelvinparacelsius();
      
      System.out.println("Kelvin em Celsius: " + kc.kelvinc());
    }
}
