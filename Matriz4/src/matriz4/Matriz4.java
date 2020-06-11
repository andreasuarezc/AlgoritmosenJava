
package matriz4;

import javax.swing.JOptionPane;


public class Matriz4 {
    private int [][] mat;
    
public Matriz4 (int [][]mat){
    this.mat = mat;
}

public void matrizCompleta(){
    for(int f =0; f<mat.length; f++){
        for(int x=0; x<mat[f].length; x++){
            System.out.print(mat[f][x]+" ");
        }
        System.out.println();
    }
}

public void ultimaFila(){
    System.out.println("La última fila de la matriz es:");
    for(int x=0; x<mat[mat.length-1].length; x++){
        System.out.print(mat[mat.length-1][x]+" ");
    }
}

    public static void main(String[] args) {
        Matriz4 matriz;
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de filas de la matriz"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de columnas de la matriz"));
        int [][] mat = new int [filas][columnas];
        for (int f=0; f<mat.length; f++){
            for (int x =0; x<mat[f].length; x++){
                mat [f][x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el componente"));
            }
        }
        matriz = new Matriz4(mat);
        matriz.matrizCompleta();
        matriz.ultimaFila();
    }
    
}
