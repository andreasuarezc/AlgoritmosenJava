
package pruebavector9;

import javax.swing.JOptionPane;

public class PruebaVector9 {
    private String[] nombres;
    private float[] notas;
    
public PruebaVector9(String[]nombres,float[]notas){
    this.nombres = nombres;
    this.notas = notas;
}

public void ordenar(){
    for (int k=0; k<notas.length;k++){
        for(int x=0; x<notas.length-1-k;x++){
            if(notas[x]<notas[x+1]){
                float auxnotas = notas[x];
                notas[x] = notas[x+1];
                notas[x+1] = auxnotas;
                String auxnombres = nombres[x];
                nombres[x] = nombres[x+1];
                nombres[x+1] = auxnombres;
            }
        }
    }
}

public void imprimir(){
    for(int x=0; x<notas.length; x++){
        System.out.println(nombres[x]);
        System.out.println(notas[x]);
    }
}

    public static void main(String[] args) {
        PruebaVector9 pruebav9;
        String[] nombres = new String [5];
        float[] notas = new float [5];
        for (int x=0; x<nombres.length;x++){
            nombres[x] = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            notas[x]= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante"));            
        }
        pruebav9 = new PruebaVector9(nombres, notas);
        pruebav9.ordenar();
        System.out.println("Nombres de alumnos y 5 notas de mayor a menor");
        pruebav9.imprimir();
    }
    
}
