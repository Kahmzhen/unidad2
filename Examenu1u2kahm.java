/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenu1u2kahm;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Examenu1u2kahm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner  (System.in);
      System.out.println("Ingresa el nombre del primer instrumento ");
         String N1 = scanner.nextLine();
        
        System.out.println("Ingresa el precio del primer instrumento");
        double P1 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Ingresa el nombre del segundo instrumento");
         String N2 = scanner.nextLine();
        
         System.out.println("Ingrese el precio del segundo instrumento");
         double P2 = scanner.nextDouble();
         
         scanner.nextLine();

        System.out.println("Ingresa el nombre del tercer instrumento");
         String N3 = scanner.nextLine();
         
        System.out.println("Ingrese el precio del tercer instrumento");
        double P3 = scanner.nextDouble();
              
      double Producto1K=   (1250.45-P1);
      double Producto2K =(3742.00-P2) ;
      double Producto3K =(2683.78-P3)  ;
      
      scanner.close();
        double Producto1KG= (Producto1K/P1)*100;
        double Producto2KG =(Producto2K/P2) ;  
         double Producto3KG = (Producto3K/P3)*100;
                
        System.out.println("");   
                System.out.println("el porcentaje de ganancia de"+N1+"es de"+Producto1KG);
                System.out.println("el porcentaje de ganancia de "+N2+"es de"+Producto2KG);
                System.out.println("el porcentaje de ganancia de "+N3+"es de"+Producto3KG);
    }
}
