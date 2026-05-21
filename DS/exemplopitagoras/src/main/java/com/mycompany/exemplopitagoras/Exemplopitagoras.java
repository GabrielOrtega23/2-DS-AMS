/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplopitagoras;
import java.util.Scanner;
/**
 *
 * @author gabrielortega
 */
public class Exemplopitagoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pitagoras hipo = new pitagoras();
        pitagoras2 cat = new pitagoras2();
        
        System.out.println("Hipotenusa: " + hipo.pitagoras());
        System.out.println("Cateto: " + cat.pitagoras2());
    }
}
