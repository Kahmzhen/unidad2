/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorademonedas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadorademonedas {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        double euros= 18.21,dolares=17.07,yen=0.12, libras=21.18;
        System.out.println("ingrese cantidad en pesos");
        double pesos= lectura.nextDouble();
        System.out.println("pesos a euros"+pesos/euros);
        System.out.println("pesos a dolares"+pesos/dolares);
        System.out.println("pesos a yenes"+ pesos /yen);
        System.out.println("pesos a libras" + pesos/ libras);
                lectura.close();
       
        
        
        
        
        
    }
}
