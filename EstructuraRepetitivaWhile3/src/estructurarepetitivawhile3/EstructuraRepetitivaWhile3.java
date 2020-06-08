
package estructurarepetitivawhile3;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaWhile3 {

    public static void main(String[] args) {
        
        int x = 1;
        int suma = 0;
        while (x<=10){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero: "));
            suma= suma + num;
            x++;
        }float promedio = suma /10;
        System.out.println("La suma de los valores ingresados es:");
        System.out.println(suma);
        System.out.println("El promedio de los valores ingresados es:");
        System.out.println(promedio);
    }
    
}
