
package vector8;

import javax.swing.JOptionPane;

public class Vector8 {

    public static void main(String[] args) {
        int []vector1 = new int [20];
        int count1 = 1;
        System.out.println("Los elementos guardados en el Vector 1 son:");
        for (int x =0; x<vector1.length; x++){            
            vector1[x] = count1;
            System.out.println(vector1[x]+ " almacenado en la posición "+x);
            count1 = count1 + 2;
        }
            
        int []vector2 = new int [20];
        int count2 = 2;
        System.out.println("Los elementos guardados en el Vector 2 son:");
        for (int x =0; x<vector2.length; x++){            
            vector2[x] = count2;
            System.out.println(vector2[x]+ " almacenado en la posición "+x);
            count2 = count2 + 2;
        }
            
        int []vector3 = new int [11];
        System.out.println("Los elementos guardados en el Vector 3 son:");
        for (int x =1; x<vector3.length; x++){            
            vector3[x] = 3*x;
            System.out.println(vector3[x]+ " almacenado en la posición "+x);
        }
    }
    
}
