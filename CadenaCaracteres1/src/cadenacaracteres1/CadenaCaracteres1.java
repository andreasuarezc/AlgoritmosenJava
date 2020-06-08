
package cadenacaracteres1;

import javax.swing.JOptionPane;

public class CadenaCaracteres1 {

    public static void main(String[] args) {
        
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la primer persona: ");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la primer persona: "));
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la segunda persona: ");
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la segunda persona: "));
        if (edad1==edad2){
            System.out.println("Las dos personas tienen la misma edad");
        }else if(edad1>edad2){
            System.out.println("La perona con mayor edad es: ");
            System.out.println(nombre1);
        }else{
            System.out.println("La perona con mayor edad es: ");
            System.out.println(nombre2);
        }
    }
    
}
