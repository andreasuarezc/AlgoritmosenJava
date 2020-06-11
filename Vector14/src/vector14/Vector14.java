
package vector14;

import javax.swing.JOptionPane;

public class Vector14 {

    public static void main(String[] args) {
        int [] vectorA = new int [5];
        int [] vectorB = new int [5];
        int [] vectorC = new int [5];
        for(int x=0; x<vectorA.length; x++){
            vectorA[x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor a la lista A"));
            vectorB[x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor a la lista B"));
        }
        System.out.println("La suma de los valores del vectorA y el vectorB que están en la msima posición es:");
        for (int x=0; x<vectorA.length; x++){
            vectorC [x] = vectorA[x] + vectorB[x];
            System.out.println(vectorC[x]);
        }
    }
    
}
