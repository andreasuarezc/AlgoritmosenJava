
package vector4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Vector4 {

    public static void main(String[] args) {
        String [] vocales = new String[5];
        vocales[0] = "a";
        vocales[1] = "e";
        vocales[2] = "i";
        vocales[3] = "o";
        vocales[4] = "u";
        int []posicion = new int [5];
        for(int x=0; x<vocales.length; x++){
            posicion[x]=x;
        }
        for (int x=0; x<vocales.length; x++){
            System.out.println("La vocal: "+vocales[x]+". Se encuentra en la posicion: "+posicion[x]);
        }
        String [] abecedario = new String[26];
        abecedario[0] = "a";
        abecedario[1] = "b";
        abecedario[2] = "c";
        abecedario[3] = "d";
        abecedario[4] = "e";
        abecedario[5] = "f";
        abecedario[6] = "g";
        abecedario[7] = "h";
        abecedario[8] = "i";
        abecedario[9] = "j";
        abecedario[10] = "k";
        abecedario[11] = "l";
        abecedario[12] = "m";
        abecedario[13] = "n";
        abecedario[14] = "o";
        abecedario[15] = "p";
        abecedario[16] = "q";
        abecedario[17] = "r";
        abecedario[18] = "s";
        abecedario[19] = "t";
        abecedario[20] = "u";
        abecedario[21] = "v";
        abecedario[22] = "w";
        abecedario[23] = "x";
        abecedario[24] = "y";
        abecedario[25] = "z";
        int []posicionabec = new int [26];
        for(int x=0; x<posicionabec.length; x++){
            posicionabec[x]=x;
        }
        for (int x=0; x<posicionabec.length; x++){
            System.out.println("La letra: "+abecedario[x]+". Se encuentra en la posicion: "+posicionabec[x]);
        }
        System.out.println("Ahora que sabes la posición de las letras puedes formar una palabra.");
        int letras = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántas letras tendrá la palabra que vas a ingresar?"));
        for (int x=0; x<letras; x++){
            int posición = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la posición de la letra "+(x+1)));
            System.out.print(abecedario[posición]+"");
        }        
    }    
}
