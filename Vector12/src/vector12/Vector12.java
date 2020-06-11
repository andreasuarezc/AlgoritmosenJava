
package vector12;

import javax.swing.JOptionPane;

public class Vector12 {

    public static void main(String[] args) {
        int [] numeros = new int [10];
        int suma = 0;
        for (int x=0; x<numeros.length; x++){
            numeros[x]= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero"));
            if ((numeros[x]%2)==0){
                suma = suma + numeros[x];
            }
        }
        System.out.println("La lista de números ingresados es:");
        for (int x=0; x<numeros.length; x++){
            System.out.println(numeros[x]);
        }
        System.out.println("La suma de los números pares que se encuentran en la lista es: ");
        System.out.println(suma);
    }
    
}
