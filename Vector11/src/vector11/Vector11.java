
package vector11;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vector11 {

    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        String opcion = "";
        int producto = 1;
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero"));
            listaDeNumeros.add(numero);
            producto = producto * numero;
            System.out.println("El producto de los números ingresados es: ");
            System.out.println(producto);
            opcion = JOptionPane.showInputDialog(null,"¿Desea agregar otro número?si/no");
        } while(opcion.equalsIgnoreCase("si"));
    }
    
}
