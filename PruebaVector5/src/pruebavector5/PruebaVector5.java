
package pruebavector5;

import javax.swing.JOptionPane;

public class PruebaVector5 {
    private String [] nombres;
    private float [] edades;

public PruebaVector5(String []nombres,float[]edades){
    this.nombres = nombres;
    this.edades = edades;
}

public void mayoresEdad(){
    int count=0;
    for (int x = 0; x<nombres.length;x++){
        if (edades[x]>=18){
            System.out.println(nombres[x]);
        }
    }
}

    public static void main(String[] args) {
        PruebaVector5 pruebav5;
        String[]nombres = new String[5];
        float[]edades = new float[5];
        for (int x= 0; x<nombres.length; x++){
            nombres[x]= JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
            edades[x]=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la edad de la persona: "));            
        }
        pruebav5 = new PruebaVector5(nombres, edades);
        System.out.println("Los nombres de las personas mayor de edad es: ");
        pruebav5.mayoresEdad();
    }
    
}
