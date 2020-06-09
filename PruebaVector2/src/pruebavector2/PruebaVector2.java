
package pruebavector2;

import javax.swing.JOptionPane;

public class PruebaVector2 {
    private float[] altura;
    private float suma;

public PruebaVector2(float[] altura, float suma){
    this.altura = altura;
    this.suma = suma;
}

public float promedio(){
    float promedio = suma/altura.length;
    return promedio;
}

public int masAltas(float promedio){
    int mas = 0;
    for (int x=0; x<altura.length;x++){
        if (altura[x]>promedio){
            mas++;
        }
    }return mas;
}

public int masBajas (float promedio){
    int menos = 0;
    for (int x=0; x<altura.length;x++){
        if (altura[x]<promedio){
            menos++;
        }
    }return menos;
}

    public static void main(String[] args) {
        PruebaVector2 pruebav2;
        float [] altura = new float [5];
        float suma = 0;
        for (int x=0; x<5; x++){
            altura [x] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la estatura de la persona"));
            suma = suma + altura[x];
        }
        pruebav2 = new PruebaVector2(altura, suma);
        float promedio = pruebav2.promedio();
        System.out.println("El promedio de las estaturas ingresadas es:");
        System.out.println(promedio);        
        System.out.println("La cantidad de personas con estatura superior al promedio es:");
        System.out.println(pruebav2.masAltas(promedio));
        System.out.println("La cantidad de personas con estatura inferior al promedio es:");
        System.out.println(pruebav2.masBajas(promedio));
        
        
    }
    
}
