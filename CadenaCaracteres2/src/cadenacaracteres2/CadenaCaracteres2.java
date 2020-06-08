
package cadenacaracteres2;

import javax.swing.JOptionPane;

public class CadenaCaracteres2 {

    public static void main(String[] args) {
        
        String apellido1 = JOptionPane.showInputDialog(null,"Ingrese el apellido de la primer persona: ");
        String apellido2 = JOptionPane.showInputDialog(null,"Ingrese el apellido de la segunda persona: ");
        if (apellido1.equals(apellido2)){
            System.out.println("Los apellidos son iguales");
        }else{
            System.out.println("Los apellidos son distintos");
        }
    }
    
}
