/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritmeticas;

/**
 *
 * @author oscar
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que imprima en consola todas las operaciones aritmetricas 
        //de dos numeros enteros (suma, resta,  multiplicacion, divicion, mod)
        int numero1 =9; 
        int numero2 =8;
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2; 
        double divicion = (double)numero1 / (double)numero2;
        int mod = numero1 % numero2;
        
        System.out.println("El resultado de la suma es:" + suma + "\nLa resta es:" + resta + 
                "\nLa multiplicacion es:" + multiplicacion + "\nLa divicion es:" + divicion + "\nEl mod es:" + mod ); 
        }
    }
