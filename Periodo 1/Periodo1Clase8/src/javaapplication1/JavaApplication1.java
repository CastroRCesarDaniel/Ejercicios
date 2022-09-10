/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    int numero1;
    int numero2;
    int suma;
    
    System.out.print ("Escriba el primer numero: ");
    numero1 = entrada.nextInt();
    System.out.println("Escriba el segundo numero: ");
    numero2 = entrada.nextInt();
    
    suma = numero1 + numero2;
    System.out.println("La suma es: " + suma);
    }
}
