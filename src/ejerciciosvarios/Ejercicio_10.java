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
public class Ejercicio_10 {
    public static void main(String[] args) {
        int x,y,z=0;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número inicial"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un número final"));         
        for (int i = x; i <= y; i++) 
        {
            z=0; 
            for (int j = 1  ; j < i; j++) 
            {
                if ((i % j)==0) 
                {
                     z=z+j;
                }
                if ((i==y)&&((i%j)!=0)) 
                {
                    z=0; 
                }
            }
            if (z==i) 
            {
                JOptionPane.showMessageDialog(null, "El primer número perfecto menor entre "+ x+" y "+y+ " es = " +z);
                i=y;
            }
        }
        if(z==0) 
        {
            JOptionPane.showMessageDialog(null, "No hay números perfectos entre "+ x+" y "+y);
        }    
    }
}
