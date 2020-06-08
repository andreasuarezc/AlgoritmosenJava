
package estructurarepetitivadowhile2;

import javax.swing.JOptionPane;

public class EstructuraRepetitivaDoWhile2 {

    public static void main(String[] args) {
        int x =0;
        int count=0;
        int suma=0;
        do{
           x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero: "));
           if (x!=0){
               suma= suma + x;
               count++;
           }           
        }while (x!=0);
        if (count!=0){
            int promedio = suma/count;
        System.out.println("El promedio de los números ingresados es: ");
        System.out.println(promedio);
        }else{
            System.out.println("No se ingresaron valores. ");
        }
        
    }
    
}
