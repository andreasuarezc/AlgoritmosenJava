
package alumno;

import javax.swing.JOptionPane;

public class Alumno {
    private String nombre;
    private int edad;
    
public Alumno(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}


public String toString() {
    return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

public String mayorEdad(){
    String mensaje = "";
    if (edad>=18){
        mensaje = "El alumno es mayor de edad";
        return mensaje;        
        }
    else{
        mensaje = "El alumno es menor de edad";
        return mensaje;
    }
}

    public static void main(String[] args) {
        Alumno alumno1;
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del alumno"));        
        alumno1 = new Alumno(nombre, edad);
        System.out.println(alumno1.toString());
        System.out.println(alumno1.mayorEdad());
    }
    
}
