
package pruebavector4;

import javax.swing.JOptionPane;

public class PruebaVector4 {
    private float [] salarios;

public PruebaVector4(float [] salarios){
    this.salarios = salarios;
}

public void imprimir(){
    for (int x = 0; x<salarios.length;x++){
        System.out.println(salarios[x]);
    }
}

    public static void main(String[] args) {
        PruebaVector4 pruebav4;
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántos salarios va almacenar en la lista?"));
        float [] salarios = new float [tamaño];
        for (int x=0; x<salarios.length; x++){
            salarios[x] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario de un empleado"));
        }
        pruebav4 = new PruebaVector4(salarios);
        pruebav4.imprimir();
        
    }
    
}
