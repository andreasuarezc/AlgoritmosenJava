
package condicionescompuestas2;

import javax.swing.JOptionPane;

public class CondicionesCompuestas2 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes: "));
        int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año: "));
        if (mes == 1 || mes == 2 || mes == 3){
            System.out.println("La fecha corresponde al primer trimestre del año");
        }
    }
    
}
