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
public class Ejercicio_01 {
    
    public static void main(String[] args) 
    {
        int x=0, y=0, a=7, b=6, c=0, mul;
        int[] arreglo1=new int[128];
        int[] arreglo2=new int[128];
        int[] arreglo3=new int[255];
        for (int i = 0; i <= 127; i++) 
        {            
            arreglo1[i]=a;
            a=a+1;
        }
        for (int j = 0; j <= 127; j++) 
        {            
            arreglo2[j]=b;
            b=b-2;   
        }
        a=0;
        for (int i = 0; i < 255; i++) 
        {
            mul=i % 2;
            if (mul==0)
            {
             arreglo3[i]=arreglo1[a];
            }
            else
            {                
                arreglo3[i]=arreglo2[a]; 
                a=a+1;
            }
            System.out.println(i+" "+arreglo3[i]);            
        }
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255 || y<=0 || y>255)
        {
            c=-1;
        }
        else
        {
            for (int i = 0; i <255; i++) 
            {
                if (x==(i+1))
                {
                    a=arreglo3[i];
                }
                else
                {
                    if (y==(i+1))
                    {
                        b=arreglo3[i];
                    }
                    
                }
            }
            c=a+b;
        }
        JOptionPane.showMessageDialog(null, c);
    }
}

