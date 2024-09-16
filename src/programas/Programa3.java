/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;
public class Programa3 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
         Scanner lectura = new Scanner(System.in);
        
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
         celsius = lectura.nextDouble();
        
        // Convertir a Fahrenheit
         fahrenheit = (celsius * 9 / 5) + 32;
        
        // Mostrar el resultado
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }
    
}
