/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplocilindro;
import javax.swing.JOptionPane;
/**
 *
 * @author gabrielortega
 */
public class Exemplocilindro {

    public static void main(String[] args) {
        cilindro c = new cilindro();
          JOptionPane.showMessageDialog(null, "Resultado da área lateral : " + c.cilindro());
          cilindro c2 = new cilindro();
          JOptionPane.showMessageDialog(null, "Resultado do volume do cilindro : " + c.cilindro1());
    }
}
