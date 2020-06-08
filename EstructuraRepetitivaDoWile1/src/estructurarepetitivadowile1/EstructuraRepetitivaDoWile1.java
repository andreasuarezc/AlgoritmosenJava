
package estructurarepetitivadowile1;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaDoWile1 {

    public static void main(String[] args) {
        int num;
        do {num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entre 0 y 999: "));
        if (num>=100){
            System.out.println("Tiene 3 dígitos.");            
        }else if (num>=10){
            System.out.println("Tiene 2 dígitos.");
        }else{
            System.out.println("Tiene 1 dígito.");
        }
        } while (num !=0); 
    }
 
}

