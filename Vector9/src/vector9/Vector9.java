
package vector9;

import javax.swing.JOptionPane;

public class Vector9 {

    public static void main(String[] args) {
        int []vector = new int [30];
        int suma = 0;
        int mayor = vector[0];
        for (int x=0; x<vector.length; x++){
            vector[x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número entero"));
            suma = suma + vector[x];
            if(vector[x]>mayor){
                mayor = vector[x];
            }          
        
        }
        int menor = vector[0];
        for(int x=0; x<vector.length; x++){
            if(vector[x]<menor){
                menor = vector[x];
            }
        }
        System.out.println("El promedio de los números ingresados es: ");
        int promedio = suma / vector.length;
        System.out.println(promedio);
        
        System.out.println("El número de mayor valor que se ingresó es: ");
        System.out.println(mayor);
        
        System.out.println("El número de menor valor que se ingresó es: ");
        System.out.println(menor);
        
        System.out.println("Los multiplos de 2 que se encuentran en la lista son:");
        for(int x=0; x<vector.length; x++){
            if((vector[x]%2)==0){
                System.out.println(vector[x]);
            }
        }
    }
    
}
