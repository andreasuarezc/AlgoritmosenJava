
package triangulo;

import javax.swing.JOptionPane;

public class Triangulo {
private int lado1;
private int lado2;
private int lado3;

public Triangulo(int lado1, int lado2, int lado3){
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
}

public int ladoMayor(int lado1,int lado2,int lado3){
    if (lado1>lado2&&lado1>lado3){
        return lado1;
    }else if(lado2>lado1 && lado2>lado3){
        return lado2;
    }else{
        return lado3;
    }
}

public String equilatero(int lado1,int lado2,int lado3){
    if (lado1==lado2 && lado1==lado3){
        String frase = "Es un triángulo equilátero";
        return frase;        
    }else{
        String frase = "No es un triángulo equilátero";
        return frase;  
    }   
}
    public static void main(String[] args) {
        Triangulo triangulo1;
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer lado del triangulo: "));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo lado del triangulo: "));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer lado del triangulo: "));
        triangulo1 = new Triangulo(lado1,lado2,lado3);
        System.out.println("El valor del lado mayor es:");
        System.out.println(triangulo1.ladoMayor(lado1,lado2,lado3));
        System.out.println(triangulo1.equilatero(lado1,lado2,lado3));
        
        
        
    }
    
}
