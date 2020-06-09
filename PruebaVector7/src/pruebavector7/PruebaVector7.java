
package pruebavector7;

import javax.swing.JOptionPane;


public class PruebaVector7 {
    private float [] salarios;
  
public PruebaVector7(float [] salarios){
    this.salarios = salarios;
}

public void menorAMayor(){
    for (int x=0; x<salarios.length; x++){
        for (int k = 0; k<salarios.length-1; k++){
            if (salarios[k]>salarios[k+1]){
                float clave = salarios[k];
                salarios[k]=salarios[k+1];
                salarios[k+1]=clave;
            }
        }
    }
}

public String imprimir(){
    String imprimir = "";
    for(int x=0;x<salarios.length;x++){
        imprimir = imprimir + salarios[x]+", ";
    }return imprimir;
}

    public static void main(String[] args) {
        PruebaVector7 pruebav7;
        float [] salarios = new float[5];
        for (int x= 0 ; x<salarios.length;x++){
            salarios[x] = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese el salario del empleado: "));
        }
        pruebav7 = new PruebaVector7(salarios);
        pruebav7.menorAMayor();
        System.out.println("los salarios de menor a mayor son:");     
        System.out.println(pruebav7.imprimir());        
    }
    
}
