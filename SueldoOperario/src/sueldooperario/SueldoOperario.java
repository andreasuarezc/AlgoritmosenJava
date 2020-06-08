
package sueldooperario;

import javax.swing.JOptionPane;


public class SueldoOperario {
    
    public static void main(String[] args) {
        
        int horasLaboradas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de horas trabajadas por el empleado: "));
        float valorHora = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la hora: "));
        float sueldoOperario = horasLaboradas * valorHora;
        System.out.println("El empleado debe cobrar: ");
        System.out.println(sueldoOperario);
        
    }
    
}
