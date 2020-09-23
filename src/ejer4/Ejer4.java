

package ejer4;

import javax.swing.JOptionPane;


public class Ejer4 {

    
    public static void main(String[] args) {
        
        int x,n,suma=0;
        double elevacion;

        x=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x(exponente): "));
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n(numero): "));
        
        for(int i=1;i<=x;i++){
        elevacion=Math.pow(n, i);
            suma+=elevacion;
        }
        
        JOptionPane.showMessageDialog(null ,"La suma total es: "+suma);
    }
    
}
