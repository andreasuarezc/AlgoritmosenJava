
package condicionescompuestas;

import javax.swing.JOptionPane;

public class CondicionesCompuestas {

    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer número: "));
        if (num1 > num2 && num1 > num3){
            System.out.println("El número mayor es: ");
            System.out.println(num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("El número mayor es: ");
            System.out.println(num2);
        }else{
            System.out.println("El número mayor es: ");
            System.out.println(num3);
        }
    }
    
}
