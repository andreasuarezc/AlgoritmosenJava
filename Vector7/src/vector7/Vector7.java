
package vector7;

import javax.swing.JOptionPane;

public class Vector7 {

    public static void main(String[] args) {
        int [] multiplos20 = new int [20];
        for (int x=0; x<multiplos20.length; x++){
            int aleatorio = (int)(Math.random()*1000);
            if ((aleatorio%20)==0){
                multiplos20[x]= aleatorio;
            }else{
                x = x-1;
            }
        }
        System.out.println("A continuación se presenta una lista de 20 números que son multiplo de 20");
        for (int x=0; x<multiplos20.length;x++){
            System.out.println(multiplos20[x]);
        }
        String respuesta1 = JOptionPane.showInputDialog(null,"¿Desea conocer el promedio de los valores de la lista? SI/NO");
        if (respuesta1.equalsIgnoreCase("SI")==true){
            int suma = 0;
               for(int x=0; x<multiplos20.length; x++){
                   suma = suma + multiplos20[x];
               }
               int promedio = suma/multiplos20.length;
               System.out.println("El promedio es: "+promedio);
        }
        String respuesta2 = JOptionPane.showInputDialog(null,"¿Desea conocer la suma de los valores de la lista? SI/NO");        
        if (respuesta2.equalsIgnoreCase("SI")==true){
            int suma = 0;
               for(int x=0; x<multiplos20.length; x++){
                   suma = suma + multiplos20[x];
               }
               System.out.println("La suma es: "+suma);                        
        }
        String respuesta3 = JOptionPane.showInputDialog(null,"¿Desea conocer el valor de cada multiplo dividido por 2? SI/NO");
        if (respuesta3.equalsIgnoreCase("SI")==true){
            int [] divisionmultiplos20 = new int [multiplos20.length];
            for (int x=0; x<divisionmultiplos20.length; x++){
                divisionmultiplos20[x] = (multiplos20[x]/2);
                System.out.println(multiplos20[x]+"/2= "+divisionmultiplos20[x]);
            }         
        }
    }
    
}
