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
public class Operaciones {


    
    
        Scanner sc = new Scanner(System.in);
         int opc = sc.nextInt();

         
         
        
            
         //realiza operaciones
         
         int rest=0;
         
        switch(opc){
            case 1: 
                rest=x+y;
                System.out.println("El resultado: "+rest+"");

                break;
            case 2: 
                rest=x-y;
                System.out.println("El resultado: "+rest+"");

                break;
           
            case 3: 
                rest=x*y;
                System.out.println("El resultado: "+rest+"");

                break;
          
            case 4: 
                rest=x/y;
               System.out.println("El resultado: "+rest+"");

                break;

            case 5: 
                System.exit(0); 
                break;

            default:
                System.out.println("Seleccione opcion valida");        
        } 
        


    
}
