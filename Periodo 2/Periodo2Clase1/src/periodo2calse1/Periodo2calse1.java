package periodo2calse1;
import java.util.Scanner;
public class Periodo2calse1 {
    public static void main(String[] args) {
        Scanner ingresar=new Scanner (System.in);
        int num1, num2, resultado, opcion;
        System.out.println("Ingrese el primer numero: ");
        num1 = ingresar.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = ingresar.nextInt();
        System.out.println(" +++++ Menu de opciones ");
        System.out.println(" Para sumar los dos numeros digite 1");
        System.out.println(" Para restar los dos numeros digite 2");
        System.out.println(" Para elevarlos al cuadrado digite 3");
        System.out.println(" Para multiplicarlos digite 4");
        opcion = ingresar.nextInt();
        
        switch(opcion){
            case 1:{
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es:"+ resultado);
                break;
            }
            case 2:{
                resultado = num1 + num2;
                System.out.println("El resultado de la resta es:"+ resultado);
                break;
            }
            case 3:{
                System.out.println("El resultado de elevar al cuadrado "+ num1 +" es: "+ Math.pow(num1,2));
                System.out.println("El resultado de elevar al cuadrado "+ num2 +" es: "+ Math.pow(num2,2));
                break;
            }
            case 4:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es:"+ resultado);
                break;
            }
            default :{
                System.out.println("Seleccione una opcion correcta.");
                break;
            }
        }
    }    