
package pruebavector3;

import javax.swing.JOptionPane;

public class PruebaVector3 {
    private float [] turnoMa;
    private float [] turnoTa;

public PruebaVector3(float [] turnoMa, float [] turnoTa){
    this.turnoMa = turnoMa;
    this.turnoTa = turnoTa;
}

public float salariosMa (){
    float suma1 = 0;
    for (int x=0; x<4;x++){
        suma1 = suma1 + turnoMa[x];
    }
    return suma1;
}

public float salariosTa (){
    float suma2 = 0;
    for (int x=0; x<4;x++){
        suma2 = suma2 + turnoTa[x];
    }
    return suma2;
}

    public static void main(String[] args) {
        PruebaVector3 pruebav3;
        float [] turnoMa = new float [4];
        float [] turnoTa = new float [4];
        for (int x=0; x<4; x++){
           turnoMa[x] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario de un empleado del turno de la mañana: "));
           turnoTa[x] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario de un empleado del turno de la tarde: "));
        }
        pruebav3 = new PruebaVector3(turnoMa, turnoTa);
        System.out.println("Total de gastos del turno de la mañana:");
        System.out.println(pruebav3.salariosMa());
        System.out.println("Total de gastos del turno de la tarde:");
        System.out.println(pruebav3.salariosTa());
        
    }
    
}
