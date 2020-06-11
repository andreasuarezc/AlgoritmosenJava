
package matriz7;

import javax.swing.JOptionPane;

public class Matriz7 {
    private int [][]mat;
    
public Matriz7(int [][] mat){
    this.mat = mat;
}

public void imprimir(){
        for (int[] lista : mat) {
            for (int x: lista) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
}

    public static void main(String[] args) {
        Matriz7 matriz;
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántas filas tendrá la matriz?"));
        int [][]mat = new int [filas][];
        for (int f=0; f<mat.length; f++){
            int  columna = Integer.parseInt(JOptionPane.showInputDialog(null, "¿cuántas columnas tendrá la fila" +(f+1)+" ?"));
            mat [f] = new int [columna];
            for (int x=0; x<mat[f].length ;x++){
                mat[f][x] = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese componente"));
            }
        }
        matriz = new Matriz7(mat);
        matriz.imprimir();
    }
    
}
