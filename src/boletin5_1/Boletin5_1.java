
package boletin5_1;

import javax.swing.JOptionPane;


public class Boletin5_1 {

    public static void main(String[] args) {
        Positivo positivo1=new Positivo();
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        positivo1.comparar(n1);
    }
    
}
