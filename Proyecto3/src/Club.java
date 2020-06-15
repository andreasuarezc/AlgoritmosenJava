
public class Club {
    private Socio socio1,socio2,socio3;
    
public Club(){
    socio1 = new Socio();
    socio2 = new Socio();
    socio3 = new Socio();
}
public void listaDeSocios(){
    socio1.imprimir();
    socio2.imprimir();
    socio3.imprimir();
}

public void mayorAntiguedad(){
    if (socio1.antiguedad()>socio2.antiguedad()&&socio1.antiguedad()>socio3.antiguedad()){
        System.out.println("El socio con mayor antiguedad en el club es: "+socio1.nombre());
    }else if (socio2.antiguedad()>socio1.antiguedad()&&socio2.antiguedad()>socio3.antiguedad()){
        System.out.println("El socio con mayor antiguedad en el club es: "+socio2.nombre());
    }else{
        System.out.println("El socio con mayor antiguedad en el club es: "+socio3.nombre());
    }
}

public static void main(String[] args){
    Club club1 = new Club();
    club1.listaDeSocios();
    club1.mayorAntiguedad();
}
}
