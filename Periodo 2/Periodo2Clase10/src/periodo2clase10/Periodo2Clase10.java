/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase10;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class Periodo2Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0, num;
        double promedio;
        Scanner ingresar = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.println("Ingresar el numero: " + i);
            num = ingresar.nextInt();
            suma = suma + num; //Acumulador
        }
        promedio = suma / 5;
        System.out.println("El promedio es: " + promedio);
    }   
}