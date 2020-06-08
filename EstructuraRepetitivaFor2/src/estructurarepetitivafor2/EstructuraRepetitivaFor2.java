
package estructurarepetitivafor2;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaFor2 {

    public static void main(String[] args) {
        int suma = 0;
        for ( int x = 1; x <= 10; x++){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero: "));
            suma = suma + num;
            
        }int promedio = suma /10;
        System.out.println("La suma de los números ingresados es: ");
        System.out.println(suma);
        System.out.println("El promedio es:");
        System.out.println(promedio);
    }
    
}
