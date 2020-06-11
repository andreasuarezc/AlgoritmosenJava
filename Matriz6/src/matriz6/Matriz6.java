
package matriz6;

import javax.swing.JOptionPane;

public class Matriz6 {
    private String [] nombres;
    private float [][] salarios;
    private float [] sueldostot;
    
public Matriz6(String []nombres, float [][] salarios, float[]sueldostot){
    this.nombres = nombres;
    this.salarios = salarios;
    this.sueldostot = sueldostot;
}

public void totalSalarios(){
    float suma = 0;
    for (int f=0; f<salarios.length; f++){
        for (int x=0; x<salarios[f].length; x++){
            suma = suma + salarios[f][x];
        }
    }System.out.println("El total de dinero gastado en el salario de los empleados en 3 meses es: "+suma);
}

public void totalempleado(){
    System.out.println("El total de salarios pagado por cada empleado es:");
    for(int x=0; x<sueldostot.length; x++){
        System.out.println(nombres[x]);
        System.out.println(sueldostot[x]);
    }
}

public void mayorSalario(){
    float mayor = sueldostot[0];
    String nombre = nombres[0];
    for (int x=0; x<sueldostot.length; x++){
        if (sueldostot[x]>mayor){
            mayor = sueldostot[x];
            nombre = nombres[x];
        }
    }System.out.println("El empleado que obtuvo mayor ingreso acumulado es: "+ nombre);
    System.out.println("Su ingreso acumulado fue de: "+ mayor);
}

    public static void main(String[] args) {
        Matriz6 matriz;
        String[] nombres = new String[4];
        float [][] salarios = new float[4][3];
        float[]sueldostot = new float [4];
        for (int f =0; f<salarios.length; f++){
            nombres[f] = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            float suma = 0;             
            for (int x=0; x<salarios[f].length; x++){
                salarios[f][x] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado en el mes "+(x+1)));
                suma = suma + salarios[f][x];
            }sueldostot[f] = suma;
        }
        matriz = new Matriz6(nombres,salarios, sueldostot);
        matriz.totalSalarios();
        matriz.totalempleado();
        matriz.mayorSalario();
    }
    
}
