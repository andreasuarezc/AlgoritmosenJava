
package estructuracondicionalanidada;

import javax.swing.JOptionPane;

public class EstructuraCondicionalAnidada {

    public static void main(String[] args) {
        
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la primer nota: "));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la segunda nota: "));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la tercer nota: "));
        float promedio = (nota1+nota2+nota3)/3;
        if (promedio >= 7){
            System.out.println("Promocionado");
        }else if (promedio>=4){
            System.out.println("Regular");
        }else {    
            System.out.println("Reprobado");
        }}
    
}
