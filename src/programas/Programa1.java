
package programas;

import java.util.Scanner;
public class Programa1 {
    public static void main(String[] args) {
        
       //Variables
       double radio;
       double area;
       
       System.out.print("Ingrese el radio del círculo: ");
        Scanner lectura = new Scanner(System.in);        
           
         radio = lectura.nextDouble();        
         area = Math.PI * Math.pow(radio, 2);
        
      
              System.out.println("El área del círculo es: " + area);
    }
    
    
}
