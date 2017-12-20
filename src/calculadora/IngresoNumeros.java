/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Perez
 */
public class IngresoNumeros {

    private void ingreso_num() {
            
         int x;
         int y;
       
         //ingreso primer numero

         int bol=0;
         
         do{
         System.out.println("Ingrese primer numero");
         Scanner sc1 = new Scanner(System.in);
         x = sc1.nextInt();
               
             if(x >=0 ){
                bol=1;
             } else{
                 System.out.println("Ingrese un numero positivo");
                 bol=0;
             }
             
             
         } while (bol==0);
         
         //ingrreso  segundo numero
         
        int bol1=0;
         
         do{
         System.out.println("Ingrese segundo numero");
         Scanner sc2 = new Scanner(System.in);
         y = sc2.nextInt();
               
         if(y >=0 ){
                bol1=1;
             } else{
                 System.out.println("Ingrese un numero positivo");
                 bol1=0;
             }
             
             
         } while (bol1==0);
         



}
    
}
