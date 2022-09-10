/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a, b, respuesta;
    String accion;
    Scanner objeto;
    
    do {
        System.out.println("Ingrese el primer numero: ");
        objeto = new Scanner (System.in);
        a = Integer.valueOf(objeto.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        b = Integer.valueOf(objeto.nextLine());
        respuesta = a + b;
        System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " - " + String.valueOf(a+b));
        
        System.out.println("¿Quieres calcular la suma de otros numeros? (S/N) ");
        Scanner teclado = new Scanner(System.in);
        accion = teclado.nextLine();
     } while (accion.equals("S") || accion.equals("s"));
   }
 }
