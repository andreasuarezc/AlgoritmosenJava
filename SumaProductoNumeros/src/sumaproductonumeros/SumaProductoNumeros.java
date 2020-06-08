
package sumaproductonumeros;

import javax.swing.JOptionPane;


public class SumaProductoNumeros {

    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número: "));
        int suma = num1 + num2;
        int producto = num1 * num2;
        System.out.println("La suma de los números ingresados es:");
        System.out.println(suma);
        System.out.println("El producto de los números ingresados es:");
        System.out.println(producto);
             
    }
    
}
