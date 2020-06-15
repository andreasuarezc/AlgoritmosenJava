
import javax.swing.JOptionPane;


public class Operacion {
    protected int valor1;
    protected int valor2;
    protected int resultado;
    
public void cargar1(){
    valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer valor"));
}

public void cargar2(){
    valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo valor"));
}

public void mostrarResultado(){
    System.out.println(resultado);
}
}
