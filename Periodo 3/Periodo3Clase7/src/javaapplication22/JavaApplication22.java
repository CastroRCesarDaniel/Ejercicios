package javaapplication22;
public class JavaApplication22 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {  //Condicion trivial: siempre cierta
            i++;
            System.out.println ("Valor de i: " + i);
            if (9==i) { break;}
        }    
    }
}