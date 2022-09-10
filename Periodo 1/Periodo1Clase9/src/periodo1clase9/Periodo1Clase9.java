/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1clase9;
import java.util.Scanner; // el programa usa la clase Scanner
/**
 *
 * @author cesar
 */
public class Periodo1Clase9 {

    private static Object entrada;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // crea objeto Scanner para obener la entrada de la ventana de comandos
        Scanner entrada = new Scanner (System.in);
        
        int numero1; // primer numero a comparar
        int numero2; // segundo numero a comparar
        
        System.out.print("Escriba el primer entero: "); // indicador
        numero1=entrada.nextInt(); // lee el primer numero del usuraio
        
        System.out.print("Escriba el segundo entero: "); // indicador
        numero2=entrada.nextInt(); // lee el segundo numero del usuraio
        
        if (numero1 == numero2);
        System.out.println("El numero " + numero1 + " es igual a " + numero2);
        
        if (numero1 != numero2);
        System.out.println("El numero " + numero1 + " es distinto a " + numero2);
        
        if (numero1 < numero2);
        System.out.println("El numero " + numero1 + " es menor a " + numero2);
        
        if (numero1 > numero2);
        System.out.println("El numero " + numero1 + " es mayor a " + numero2);
        
        if (numero1 <= numero2);
        System.out.println("El numero " + numero1 + " es menor o igual a " + numero2);
        
        if (numero1 >= numero2);
        System.out.println("El numero " + numero1 + " es mayor o igual a " + numero2);
    }   
}