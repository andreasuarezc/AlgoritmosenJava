
import javax.swing.JOptionPane;


public class Socio {
    private String nombre;
    private int antiguedad;
    
public Socio(){
    this.nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del socio");   
    this.antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la antiguedad del socio"));   
}

public void imprimir(){
    System.out.println(nombre+" tienen una antiguedad de: "+antiguedad);
}

public int antiguedad(){
    return antiguedad;
}

public String nombre(){
    
    return nombre;
}
}
