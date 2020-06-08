
package tablamultiplicar;

import javax.swing.JOptionPane;

public class TablaMultiplicar {
    
    public void cargarValor(){
        int valor;
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor: "));
            if (valor!=0){
                calcular(valor);
            }
            
        }while (valor!=-1);
        
    }
    
    public void calcular(int valor){
        for(int x=valor; x<=(valor*10); x=x+valor){
            System.out.println(x+"-");
        }
    }

    public static void main(String[] args) {
        TablaMultiplicar tabla;
        tabla = new TablaMultiplicar();
        tabla.cargarValor();
    }
    
}
