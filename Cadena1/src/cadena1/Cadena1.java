
package cadena1;

import javax.swing.JOptionPane;

public class Cadena1 {
    private String cadena1;
    private String cadena2;
  
public Cadena1(String cadena1, String cadena2){
    this.cadena1 = cadena1;
    this.cadena2 = cadena2;
}

public void equals(){
    if (cadena1.equals(cadena2)==true){
        System.out.println(cadena1+" es exactamente igual a "+cadena2);
    }else{
        System.out.println(cadena1+" no es exactamente igual a "+cadena2);
    }
    
}

public void ignoreCase(){
    if (cadena1.equalsIgnoreCase(cadena2)==true){
        System.out.println(cadena1+" es exactamente igual a "+cadena2+" sin tener en cuenta Mayúsculas/ Minúsculas.");
    }else{
        System.out.println(cadena1+" no es exactamente igual a "+cadena2+" sin tener en cuenta Mayúsculas/ Minúsculas.");
    }
}

public void compareTo(){
    if (cadena1.compareTo(cadena2)==0){
        System.out.println(cadena1+" es exactamente igual a "+cadena2);
    }else if(cadena1.compareTo(cadena2)>0){
        System.out.println(cadena1+" es mayor alfabéticamente que "+cadena2);
    }else{
        System.out.println(cadena2+" es mayor alfabéticamente que "+cadena1);
    }
}

public void extraerCarcater(){
    char carac1 = cadena1.charAt(0);
    System.out.println("El primer caracter de la primer oración es: "+ carac1);
}

public void largoString(){
    int largo = cadena1.length();
    System.out.println("El largo del la oración 1: " +cadena1+ ". es: "+largo);
}

public void substring(){
    String cadena3 = cadena2.substring(0, 3);
    System.out.println("Los primeros 3 caracteres de la oración 2: "+cadena2+". es: "+cadena3);
}

public void contenido(){
    int pos = cadena1.indexOf(cadena2);
    if (pos == -1 ){        
        System.out.println(cadena2+". no está contenido en "+cadena1);
    }else{
        System.out.println(cadena2+". está contenido en "+cadena1+". A partir de la posición: "+pos);
    }
   
}

public void convertirMayusculas(){
    System.out.println(cadena1+".Convertido a mayúsculas es: "+cadena1.toUpperCase());
}

public void convertirMinusculas(){
    System.out.println(cadena1+".Convertido a minúsculas es: "+cadena1.toLowerCase());
}

    public static void main(String[] args) {
        Cadena1 cadena;
        String cadena1 = JOptionPane.showInputDialog(null, "Ingresa una oración");
        String cadena2 = JOptionPane.showInputDialog(null, "Ingresa una oración");
        cadena = new Cadena1(cadena1,cadena2);
        cadena.equals();
        cadena.ignoreCase();
        cadena.compareTo();
        cadena.extraerCarcater();
        cadena.largoString();
        cadena.substring();
        cadena.contenido();
        cadena.convertirMayusculas();
        cadena.convertirMinusculas();
    }
    
}
