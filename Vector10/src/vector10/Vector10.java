
package vector10;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vector10 {

    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        int suma =0;
        int numero = 0;
        System.out.println("Vamos a crear una lista de números enteros.");
        System.out.println("Cuando ingreses un número negativo se detendrá la creación de la lista.");
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero"));
            listaDeNumeros.add(numero);
            suma = suma + numero;
        } while(numero>=0);
        System.out.println("La suma de los valores ingresados es:");
        System.out.println(suma);
    }
    
}
