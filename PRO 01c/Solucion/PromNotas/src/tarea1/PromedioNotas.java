package tarea1;

import java.util.Scanner;

/**
 * Leer las notas de cuatro exámenes durante el curso, los cuales tienen una
 * ponderación de 20% el primero y el segundo y 30% los dos últimos.
 * Calcular y escribir la nota final resultante.
 
 * @author JJBH
 */
public class PromedioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float primeraNota, segundaNota, terceraNota, cuartaNota ;
        
        System.out.print("Escriba la primera nota: ");
        Scanner sc = new Scanner(System.in);
        primeraNota = sc.nextFloat() ;
        
        System.out.print("Escriba la segunda nota: ");
        segundaNota = sc.nextFloat() ;
        
        System.out.print("Escriba la tercera nota: ");
        terceraNota = sc.nextFloat() ;
        
        System.out.print("Escriba la cuarta nota: ");
        cuartaNota = sc.nextFloat() ;
        
        float resultado = (float) (0.2 * primeraNota + 0.2 * segundaNota +
                0.3 * terceraNota + 0.3 * cuartaNota) ; 
        
        System.out.print("\nLa nota ponderada es: " + resultado);
               
    }
    
}