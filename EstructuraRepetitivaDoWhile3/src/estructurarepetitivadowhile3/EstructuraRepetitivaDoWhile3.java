
package estructurarepetitivadowhile3;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaDoWhile3 {

    public static void main(String[] args) {
        float peso;
        int count = 0;
        int mayor = 0;
        int medio = 0;
        int menor = 0;
        do {
            peso = Float.parseFloat
        (JOptionPane.showInputDialog
        (null, "Ingrese el peso (en kilogramos) de la pieza: "));        
         if (peso>10.2){
            mayor++; 
         }else if (peso>=9.8){
            medio++;
        }else if (peso>0){
             menor++;
         }
        }while (peso!= 0);
        int suma = mayor + medio + menor;
        System.out.println("La cantidad total de piezas procesadas es: ");
        System.out.println(suma);
        System.out.println("La cantidad de piezas con peso superior a 10.2 Kg es: ");
        System.out.println(mayor);
        System.out.println("La cantidad de piezas con peso entre 9.8 Kg. y 10.2 Kg: ");
        System.out.println(medio);
        System.out.println("La cantidad de piezas con peso infeior a 9.8 Kg es: ");
        System.out.println(menor);
        
    }
    
}
