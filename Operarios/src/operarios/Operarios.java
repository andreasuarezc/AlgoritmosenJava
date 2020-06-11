
package operarios;

import javax.swing.JOptionPane;

public class Operarios {
    private float [] salarios;
    
public Operarios(float[]salarios){
    this.salarios = salarios;
}

public void imprimir(){
    for (int x =0; x<salarios.length; x++){
        System.out.println(salarios[x]);
    }
}


    public static void main(String[] args) {
        Operarios oper;
        float [] salarios = new float [5];
        for (int x =0; x<salarios.length; x++){
            salarios[x] = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el salario del operario"));
        }
        oper = new Operarios (salarios);
        oper.imprimir();
    }
    
}
