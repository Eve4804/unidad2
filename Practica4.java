/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.util.Scanner;

public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner moneda = new Scanner(System.in);
        System.out.println(" Ingresa la cantidad en moneda mexicana");
        double peso = moneda.nextInt();
        final double dolar = 17.5;
        final double euro = 18;
        
        double totald = peso / dolar;
        double totale = peso/ euro;
        
       System.out.println("Tu cantidad en dolares es " + totald + " y tu cantidad en euro es " +totale);
       
        
        
        
      
        
      
    }
    
}
