/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando un objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrar mensaje al usuario
        System.out.print("INGRESE LADO DE UN HEXAGONO");
        double lado = input.nextDouble();
        
        //Calcular el area del hexagono
        double area = ((3*Math.pow(3.0.5))/2)*Math.pow(lado.2);
        
        //Mostrar el resultado
        System.out.println("El area del hexagono es:  "+ area);
    }
}
