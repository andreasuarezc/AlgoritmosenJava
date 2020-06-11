
package matriz2;

import javax.swing.JOptionPane;

public class Matriz2 {
    private int [][] mat;
    
public Matriz2(int [][] mat){
    this.mat = mat;
}

public void imprimir(){
    for(int f=0; f<4; f++){
        for (int c =0; c<4; c++){
            if (c==f){
                System.out.println(mat[f][c]);
            }
        }
    }
}

    public static void main(String[] args) {
        Matriz2 matriz;
        int[][] mat = new int [4][4];
        for(int f=0; f<4; f++){
            for (int c=0; c<4; c++){
                mat[f][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese componente"));
            }
        }
        matriz = new Matriz2(mat);
        matriz.imprimir();
    }
    
}
