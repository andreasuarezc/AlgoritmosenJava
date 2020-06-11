
package vector13;

import javax.swing.JOptionPane;

public class Vector13 {

    public static void main(String[] args) {
        int [] vector = new int [30];
        int suma=0;
        int multiplo = 1;
        for(int x=0; x<vector.length; x++){
            vector[x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor a la lista")); 
            if ((vector[x]%2)==0){
                suma = suma + vector[x];
            }
            if (vector[x]!=0 && (vector[x]%5)==0){
                multiplo = multiplo*vector[x];
            }
        }
        for (int x=0; x<vector.length; x++){
            System.out.println(vector[x]);
        }
        System.out.println("La suma de los números pares de la lista es:");
        System.out.println(suma);
        System.out.println("El producto de los números multiplos de 5 de la lista es:");
        System.out.println(multiplo);
    }
    
}
