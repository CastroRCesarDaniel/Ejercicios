package periodo2clase15;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Periodo2Clase15 {
    public static void main(String[] args) {
        double area, descuento, preciototal=10000, total;
        Scanner ingresar = new Scanner(System.in);
        area = ingresar.nextDouble();
        int valor = 0;
        if (area<400 && area<500) {
            valor = 1;
        } else if (area>500 && area<1000) {
            valor = 2;
        } else if (area>1000) {
            valor = 3;
        }
        switch (valor) {
            case 1:
                descuento = preciototal*.10;
                total = preciototal-descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de: 10%");
                JOptionPane.showMessageDialog(null, "El precio total es de" + total );
                break;
            case 2:
                descuento = preciototal*.10;
                total = preciototal-descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de: 5%");
                JOptionPane.showMessageDialog(null, "El precio total es de" + total );
                break;
            case 3:    
                descuento = preciototal*.10;
                total = preciototal -descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de: 2.5%");
                JOptionPane.showMessageDialog(null, "El precio total es de" + total );
                break;
            default:
        }
    }   
}