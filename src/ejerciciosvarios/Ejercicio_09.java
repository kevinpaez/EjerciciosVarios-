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
public class Ejercicio_09 {
    public static void main(String[] args) {
         int num=0,x=0;
        for (int i = 0; i < 2; i++) 
        {
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número positivo"));
            if (num>0)
            {   i=2;   
            }
            else
            {
                i=0;
                JOptionPane.showMessageDialog(null, "Debe de ingresar números positivos" );
            }  
        }
        long[] arreglo=new long[num];
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i]=i*i;           
        }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (num==arreglo[i])
            {
                i=arreglo.length;
                x=1;
            }
        }
        if (x==1 || num==1)
        {
            JOptionPane.showMessageDialog(null, "TRUE" );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }        
    }
}
