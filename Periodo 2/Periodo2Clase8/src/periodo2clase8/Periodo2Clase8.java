/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase8;
import java.util.Scanner;
public class Periodo2Clase8 {
public static void main(String[] args) {
    {
            Scanner ingresar=new Scanner(System.in);
            int num;
            System.out.println("Ingrese un numero para generar la tabala de multiplicar");
            num = ingresar.nextInt();
    
         for (int j = 1; j < 10; j++) {
        
            System.out.println( num + " * "+ j+ " = "+ num*j);
            } 
        }  
    }
}