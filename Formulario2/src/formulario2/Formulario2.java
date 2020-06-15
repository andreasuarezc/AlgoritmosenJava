
package formulario2;
import javax.swing.*;

public class Formulario2 extends JFrame {
    private JLabel label1;
    
public Formulario2(){
    setLayout(null);
    label1 = new JLabel("Hola Mundo.");
    label1.setBounds(10, 20, 200, 30);
    add (label1);
}
    public static void main(String[] args){
        Formulario2 formulario1 = new Formulario2();
        formulario1.setBounds(10, 10, 400, 300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
