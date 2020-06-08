
package estructurarepetitivafor4;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaFor4 {

    public static void main(String[] args) {
        int multiplo3 = 0;
        int multiplo5 = 0;
        for (int x = 1; x <= 10; x++ ){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero: "));
            if (num%3==0){
                multiplo3++;
            }if (num%5==0){
                multiplo5++;
            }
        }System.out.println("La cantidad de números ingresados que son múltiplo de 3 es: ");
        System.out.println(multiplo3);
        System.out.println("La cantidad de números ingresados que son múltiplo de 5 es: ");
        System.out.println(multiplo5);
    }
    
}
