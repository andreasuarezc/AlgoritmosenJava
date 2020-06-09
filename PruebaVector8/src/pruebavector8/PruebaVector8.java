
package pruebavector8;

import javax.swing.JOptionPane;

public class PruebaVector8 {
    private String[] paises;
  
public PruebaVector8(String []paises){
    this.paises = paises;
}

public void ordenAlfabetico(){
    for (int k=0;k<4;k++){
        for(int x=0; x<4-k;x++){
            if(paises[x].compareTo(paises[x+1])>0){
                String clave = paises[x];
                paises[x]=paises[x+1];
                paises[x+1]=clave;
                
            }
        }
    }
}

public String imprimri(){
    String listaPaises="";
    for(int x=0; x<paises.length;x++){
        listaPaises = listaPaises+paises[x]+", ";
    }
    return listaPaises;
}
    public static void main(String[] args) {
        PruebaVector8 pruebav8;
        String [] paises = new String[5];
        for (int x = 0; x<paises.length;x++){
            paises[x] = JOptionPane.showInputDialog("Ingrese el nombre de un país: ");
        }
        pruebav8 = new PruebaVector8(paises);
        pruebav8.ordenAlfabetico();
        System.out.println("Paises ordenados de forma alfabética:");
        System.out.println(pruebav8.imprimri());
        
    }
    
}
