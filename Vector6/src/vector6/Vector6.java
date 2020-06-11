
package vector6;

import javax.swing.JOptionPane;

public class Vector6 {

    public static void main(String[] args) {
        float [] notasmat = new float [5];
        float [] notasing = new float [5];
        String [] nombre = new String [5];
        float [] promedio = new float[5];
        for (int x=0; x<5; x++){
            nombre[x] = JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante");
            notasmat[x]=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de matemáticas"));
            notasing[x]=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de inglés"));
            promedio[x] = (notasmat[x]+notasing[x])/2;    
            }
        String nomb = JOptionPane.showInputDialog(null,"Ingresa el nombre del estudiante del cual desea conocer el promedio");
        nomb.equalsIgnoreCase(nomb);
        int posicion = 0;
        for (int x=0; x<nombre.length; x++){
            if (nomb==nombre[x]){
                posicion = x;
            }
        }
        System.out.println("El promedio de notas de "+nombre[posicion]+" es:"+promedio[posicion]);
    }
    
}
