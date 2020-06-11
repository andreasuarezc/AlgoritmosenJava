
package matriz1;

import javax.swing.JOptionPane;

public class Matriz1 {
    private int[][] mat;
    
public Matriz1(int [][] mat){
    this.mat = mat;
}

public void imprimir(){
    for(int f=0; f<3;f++){
        for (int c=0; c<5; c++){
            System.out.print(mat[f][c]+" ");
        }System.out.println();
    }
}
    public static void main(String[] args) {
        Matriz1 matriz;
        int[][] mat = new int [3][5];
        for(int f =0; f<3; f++){
            for(int c=0; c<5;c++){
                mat [f][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese componente"));
            }
        }
        matriz = new Matriz1(mat);
        matriz.imprimir();
    }
    
}
