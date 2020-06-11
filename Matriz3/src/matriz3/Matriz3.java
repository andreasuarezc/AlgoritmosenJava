
package matriz3;

import javax.swing.JOptionPane;

public class Matriz3 {
    private int [][] mat;

public Matriz3(int [][]mat){
    this.mat = mat;
}

public void imprimir(){
   for (int f =0; f<3;f++){
            for (int c=0; c<4;c++){
                if(f==0 || f==2 || c==0){
                    System.out.print(mat[f][c]+" ");                
                }
            }System.out.println();
   }
}

    public static void main(String[] args) {
        Matriz3 matriz;
        int [][] mat = new int [3][4];
        for (int f =0; f<3;f++){
            for (int c=0; c<4;c++){
                mat[f][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el componente"));
            }            
        }
        matriz = new Matriz3(mat);
        matriz.imprimir();
    }
    
}
