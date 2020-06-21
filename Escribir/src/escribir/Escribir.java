
package escribir;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Escribir extends JFrame implements ActionListener{
    JTextField entrada;
    File archivo;
    JButton boton;
    
    public Escribir(){
        entrada = new JTextField("Escribe");
        boton = new JButton("Guardar");
        add(entrada);
        add(boton);
        boton.addActionListener(this);
        
        Container contenedor = getContentPane();
        contenedor.add(entrada,BorderLayout.NORTH);
        
        setSize(400, 400);
        setVisible(true);
        
    }
        

    public static void main(String[] args) {
        Escribir escribir = new Escribir();
        escribir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String texto = entrada.getText();
        if(ae.getSource()==boton){
            File archivo = new File("C:\\Users\\USUARIO\\Documents\\cita\\archivoEjemplo.txt");
            
            try{
                FileWriter writer = new FileWriter(archivo);
                PrintWriter escribir = new PrintWriter(writer);
                escribir.append("Hola");
                escribir.println();
                escribir.append(texto);
                escribir.close();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
