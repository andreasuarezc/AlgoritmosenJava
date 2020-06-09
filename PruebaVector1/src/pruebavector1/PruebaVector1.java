
package pruebavector1;

import javax.swing.JOptionPane;

public class PruebaVector1 {
    private int[] sueldos;

public PruebaVector1(int[] sueldos){
    this.sueldos = sueldos;
}

public String imprimir(){
    String valores = "";
    for (int x =0; x<sueldos.length; x++){
        valores = valores + sueldos[x] + " , ";
    }
    return valores;
}
    public static void main(String[] args) {
        PruebaVector1 pruebav1;
        int[] sueldos = new int[5];        
        for (int x =0; x<5; x++){
            sueldos[x]= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado: "));
        }
        pruebav1 = new PruebaVector1(sueldos);
        System.out.println(pruebav1.imprimir());         
        
        
        
    }
    
}
