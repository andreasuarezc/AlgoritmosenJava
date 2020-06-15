
import javax.swing.JOptionPane;


public class Empleado extends Persona{
    protected int sueldo;
    
public void cargarSueldo(){
    sueldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el sueldo"));
}

public void imprimirSueldo(){
    System.out.println("El sueldo es: "+sueldo);
}

public static void main (String[] args){
    Empleado empleado1 = new Empleado();
    empleado1.imprimirNombre();
    empleado1.imprimirEdad();
    empleado1.imprimirSueldo();
}
}
