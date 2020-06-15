
import javax.swing.JOptionPane;


public class Persona {
    protected String nombre;
    protected int edad;
    
public void cargarNombre(){
    nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");    
}

public void cargarEdad(){
    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
}

public void imprimirNombre(){
    System.out.println("El nombre es: "+nombre);
}

public void imprimirEdad(){
    System.out.println("La edad es: "+edad);
}
}
