/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int password;
        do {
            System.out.print( "Introduzca su contraseña numerica: " );
            password = teclado.nextInt();
    
            if (password != 1234)    
                System.out.println( "No es valida." );
        }
        while (password != 1234);
    }
}