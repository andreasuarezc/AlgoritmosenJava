
package estructurarepetitivawhile2;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaWhile2 {

    public static void main(String[] args) {
        
        int x = 1;
        int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero superior a 1"));
        while(x<=limite){
            System.out.println(x);
            x++;
        }
    }
    
}
