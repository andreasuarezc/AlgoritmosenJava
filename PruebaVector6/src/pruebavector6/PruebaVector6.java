
package pruebavector6;

import javax.swing.JOptionPane;

public class PruebaVector6 {
    private String [] nombres;
    private float [] salarios;
    
public PruebaVector6(String [] nombres, float [] salarios){
    this.nombres = nombres;
    this.salarios = salarios;
}

public void salarioMayor(){
    float mayor = salarios [0];
    int indice = 0;
    for (int x = 0;x<nombres.length;x++){
        if (salarios[x]>mayor){
            mayor = salarios[x];
            indice =x;
        }
    }System.out.println(nombres[indice]);
    System.out.println(salarios[indice]);
}

    public static void main(String[] args) {
        PruebaVector6 pruebav6;
        String [] nombres = new String[5];
        float[] salarios = new float[5];
        for (int x=0; x<nombres.length;x++){
            nombres[x] = JOptionPane.showInputDialog(null, "Ingrese el nombre del operario:");
            salarios[x] = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el salario del empleado: "));
        }
        pruebav6 = new PruebaVector6(nombres,salarios);
        System.out.println("La persona con el sario más alto es:");
        pruebav6.salarioMayor();
    }
    
}
