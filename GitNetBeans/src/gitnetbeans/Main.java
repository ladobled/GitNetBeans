/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gitnetbeans;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        int edad;
        
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = entrada.nextInt();
        
    }
    
}
