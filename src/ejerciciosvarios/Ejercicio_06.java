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
public class Ejercicio_06 {
    public static void main(String[] args) {
        String x="";
        String palabra=JOptionPane.showInputDialog(null,"Ingrese uns frase : ");
        String []frase=palabra.split(" ");
        for(int i=frase.length-1;i>=0;i--)
        {
            x=x+frase[i]+" ";            
        }
        JOptionPane.showMessageDialog(null, x);
    }   
}
