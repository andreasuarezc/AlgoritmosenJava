
package estructurarepetitivawhile4;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaWhile4 {

    public static void main(String[] args) {
        
        int piezas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cual es la cantidad de piezas a procesar: "));
        int x = 1;
        int cantidad = 0;
        while(x<=piezas){
            float longitud = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la medida de la pieza: "));
            if (longitud>=1.20 && longitud<=1.30){
                cantidad = cantidad + 1;
            }x++;
        }System.out.println("La  cantidad de piezas cuya longitud está en el rango 1.20 a 1.30, es: ");
        System.out.println(cantidad);
            
    }
    
}
