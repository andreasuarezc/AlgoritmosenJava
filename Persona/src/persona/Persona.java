
package persona;

import javax.swing.JOptionPane;

public class Persona {
private String nombre;
private int edad;

public static String hola(){
    return "Hola mi nombre es Andrea";
}
public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}

public String imprimir(){
   return "nombre: "+nombre + "\n" + "Edad: "+edad;
}
public boolean esMayorEdad(){
    return edad >= 18;
}

    public static void main(String[] args) {
        System.out.println(Persona.hola());
        Persona persona1;
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad: "));
        persona1 = new Persona(nombre, edad);
        System.out.println(persona1.imprimir());
        if (persona1.esMayorEdad()){
            System.out.println(nombre+" es mayor de edad");       
        }else{
             System.out.println(nombre+" no es mayor de edad");
        }     
    }
    
}
