/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloqueguardaeimprime;

/**
 *
 * @author oscar
 */
public class ArregloQueGuardaeImprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un arreglo que guarde e imprima 10 nombres de tus compañeros de la clase
        
        String[] NombreDelCompañero = new String [10];
        
        NombreDelCompañero[0] = "1. Alejandra Delattibodier";
        NombreDelCompañero[1] = "2. Andrea Discua";
        NombreDelCompañero[2] = "3. Bianca Bonilla";
        NombreDelCompañero[3] = "4. Cristhy pineda";
        NombreDelCompañero[4] = "5. Carlos Meza";
        NombreDelCompañero[5] = "6. Darlyng Cabrera";
        NombreDelCompañero[6] = "7. Damian Funez";
        NombreDelCompañero[7] = "8. Ever Guardado";
        NombreDelCompañero[8] = "9. Iliana Rapalo";
        NombreDelCompañero[9] = "10. Wuilliams Berrios";
                
        System.out.println("Nombres de los companeros de clase:");
        for (String nombre: NombreDelCompañero){
            System.out.println(nombre);
        }
    }   
}
