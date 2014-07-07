/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosvarios;

import javax.swing.JOptionPane;

/**
 *
 * @author kenan
 */
public class Ejercicio_02 {
    
    public static void main(String[] args) {
        int x,y,z;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255)
        {
            z=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+z);
        }
        else
        {
            int[] arreglo=new int[y];
            arreglo[0]=x;
            for (int i = 1; i < arreglo.length; i++) 
            {
               x=x*(i+1);
               arreglo[i]=x;
                System.out.println(i+" "+arreglo[i]);               
            }
            for (int i = 0; i < arreglo.length; i++) 
            {
                if(i==(y-1))
                {
                    z=arreglo[i];
                    JOptionPane.showMessageDialog(null,"Resultado "+z);
                }
            }
        }
        
    }
}
