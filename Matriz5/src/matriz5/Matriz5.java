
package matriz5;

import javax.swing.JOptionPane;

public class Matriz5 {
    private int [][] mat;
    
public Matriz5(int[][] mat){
    this.mat = mat;
}

public void mayorElemento(){
    int mayor = mat[0][0];
    int filamay = 0;
    int columnamay = 0;
    for(int f=0; f<mat.length; f++){
        for(int x=0; x<mat[f].length; x++){
            if (mat[f][x]>mayor){
                mayor=mat[f][x];
                filamay = f;
                columnamay = x;
            }
        }
    }System.out.println("El elemento de mayor valor es: "+mayor);
    System.err.println("Se encuentra en la fila: "+filamay+" y en la columna: "+columnamay);
    
}
  
    public static void main(String[] args) {
        Matriz5 matriz;
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántas filas tedrá de la matriz?"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántas columnas tendrá la matriz?"));
        int [][] mat = new int [filas][columnas];
        for(int f=0; f<mat.length;f++){
            for (int x=0; x<mat[f].length;x++){
                mat[f][x]= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el componente"));
            }
        }
        matriz = new Matriz5(mat);
        matriz.mayorElemento();
    }
    
}
