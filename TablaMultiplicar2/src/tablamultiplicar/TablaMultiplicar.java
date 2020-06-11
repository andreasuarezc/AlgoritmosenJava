
package tablamultiplicar;

import javax.swing.JOptionPane;

public class TablaMultiplicar {
    private int tabla;
    private int terminos;
    
public TablaMultiplicar(int tabla, int terminos){
    this.tabla = tabla;
    this.terminos = terminos;
}

public TablaMultiplicar(int tabla){
    this.tabla = tabla;
    this.terminos = 10;
}

public void imprimir(){
    System.out.println("Tabla de multiplicar del "+tabla);
    for (int x=1; x<=terminos; x++){
        int resultado = x*tabla;
        System.out.println(tabla+"*"+x+"="+resultado);
    }
    
}
    public static void main(String[] args) {
        TablaMultiplicar tabla1 = new TablaMultiplicar(5);
        tabla1.imprimir();
        TablaMultiplicar tabla2 = new TablaMultiplicar(3,5);
        tabla2.imprimir();
        
    }
    
}
