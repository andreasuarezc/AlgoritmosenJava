
package cuadrado;

import javax.swing.JOptionPane;

public class Cuadrado {
    private float lado;
    
public Cuadrado(float lado){
    this.lado = lado;
} 

public float perimetro(float lado){
    float perimetro = lado*4;
    return perimetro;
}

public float area (float lado){
    float area = (lado*lado);
    return area;
    
}

    public static void main(String[] args) {
        Cuadrado cuadrado1;
        float lado = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el lado del cuadrado: "));
        cuadrado1 = new Cuadrado(lado);
        System.out.println("El perimetro del cuadrado es:");
        System.out.println(cuadrado1.perimetro(lado));
        System.out.println("El área del cuadrado es:");
        System.out.println(cuadrado1.area(lado));
    }
    
}
