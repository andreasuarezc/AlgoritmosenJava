
package estructurarepetitivafor3;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaFor3 {

    public static void main(String[] args) {        
        float suma1 = 0;
        float suma2 = 0;
        for ( int x=1; x<=10; x++){
            float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota: "));
            if (nota>=7){
                suma1++;            
            }else{
                suma2++;
        }
    }System.out.println("La cantidad de notas igual o superior a 7 es:");
    System.out.println(suma1);
    System.out.println("La cantidad de notas inferior a 7 es:");
    System.out.println(suma2);
    }
}
