
package mayormenor;

import javax.swing.JOptionPane;

public class MayorMenor {
    public void cargarValores(){
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor: "));
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer valor: "));
        int mayor = calcularMayor(valor1,valor2,valor3);
        int menor = calcularMenor(valor1,valor2,valor3);
        System.out.println("El valor mayor de los tres es:"+mayor);
        System.out.println("El valor menor de los tres es:"+menor);
    }
    
    public int calcularMayor(int valor1, int valor2, int valor3){
        int m;
        if(valor1>valor2 && valor1>valor3) {
          m=valor1;
        } else {
            if(valor2>valor3) {
                m=valor2;
            } else {
            	m=valor3;
            }
        }
        return m;

    }
    
    public int calcularMenor(int valor1, int valor2, int valor3){
        int m;
        if(valor1<valor2 && valor1<valor3) {
          m=valor1;
        } else {
            if(valor2<valor3) {
                m=valor2;
            } else {
            	m=valor3;
            }
        }
        return m;

    }

    public static void main(String[] args) {
        MayorMenor mayorymenor = new MayorMenor();
        mayorymenor.cargarValores();
        
    }
    
}
