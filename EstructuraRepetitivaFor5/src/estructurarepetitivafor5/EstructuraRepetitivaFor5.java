
package estructurarepetitivafor5;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaFor5 {

    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos número va ingresar?: "));
        int contador = 0;
        for (int x =1; x<=cantidad;x++){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: "));
            if (num >= 1000){
                contador++;
            }
        }System.out.println("La cantidad de números superiores o iguales a 1000 es: ");
        System.out.println(contador);
    }
}
