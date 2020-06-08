
package punto;

import javax.swing.JOptionPane;

public class Punto {
    private float coordenadax;
    private float coordenaday;
    
public Punto(float coordenadax, float coordenaday){
    this.coordenadax = coordenadax;
    this.coordenaday = coordenaday;
}

public String cuadrante(float coordenadax, float coordenaday){
    if (coordenadax>0 && coordenaday>0){
        String cuadrante = "Cuadrante 1";
        return cuadrante;        
    }else if(coordenadax<0 && coordenaday>0){
        String cuadrante = "Cuadrante 2";
        return cuadrante;
    }else if(coordenadax<0 && coordenaday<0){
        String cuadrante = "Cuadrante 3";
        return cuadrante;
    }else if (coordenadax>0 && coordenaday<0){
        String cuadrante = "Cuadrante 4";
        return cuadrante;
    }else{
        String cuadrante = "El punto no está en un cuadrante";
        return cuadrante;
    }
}
        
    public static void main(String[] args) {
        Punto punto1;
        float coordenadax = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la coordenada X: "));
        float coordenaday = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la coordenada Y: "));
        punto1 = new Punto(coordenadax, coordenaday);
        System.out.println("Las coordenadas ingresadas corresponde a:");
        System.out.println(punto1.cuadrante(coordenadax, coordenaday));
    }
    
}
