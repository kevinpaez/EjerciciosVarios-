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
public class Ejercicio_04 {
    public static void main(String[] args) {
        String cad1, cad2, x;        
        cad1=(JOptionPane.showInputDialog("Ingrese Cadena_1"));
        cad2=(JOptionPane.showInputDialog("Ingrese cadena_2"));    
        cad2=cad2.toLowerCase();
        x=cad2.toUpperCase();
        int longitud1=cad1.length();
        int longitud2=cad2.length();               
        char[] frase1 = cad1.toCharArray();
        char[] frase2 = cad2.toCharArray(); 
        char[] frase3 = x.toCharArray();         
         for (int i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frase1[j]== frase2[i] || frase1[j]== frase3[i]) 
                  {
                      frase1[j]=' ';
                  }
              }
          }             
          for (int i = 0; i < longitud1; i++) 
          {
              if (frase1[i]!=' ')
              {
                  System.out.print(frase1[i]);
              }
          }
    }
}
