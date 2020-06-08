
package estructuracondicionalsimple;

import javax.swing.JOptionPane;

public class EstructuraCondicionalSimple {

    public static void main(String[] args) {
        
        float sueldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el sueldo del empleado"));
        if (sueldo > 3000){
            System.out.println("Esta persona debe abonar impuesto");
        }
    }
    
}
