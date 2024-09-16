
package programas;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double numero;
        double raiz;
                
         System.out.print("Ingrese un número positivo: ");
         numero = lectura.nextDouble();
        
        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            
             raiz = Math.sqrt(numero);
            
             System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
    
    }
}
