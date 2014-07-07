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
public class Ejercicio_05 {
     public static void main(String[] args) {
       
        int ran=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango del vector"));
        int[] arreglo=new int[ran];
        
        for (int i = 0; i < arreglo.length; i++) {
            
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));

            arreglo[i]=numero;
        }
        System.out.println("Arreglo Desordenado: \n");
        for (int i = 0; i < arreglo.length; i++) {
            
            System.out.print(arreglo[i]);
        }
        System.out.println("");
         int i, j, aux;
         for(i=0;i<arreglo.length-1;i++)
              for(j=0;j<arreglo.length-i-1;j++)
                   if(arreglo[j+1]<arreglo[j]){
                      aux=arreglo[j+1];
                      arreglo[j+1]=arreglo[j];
                      arreglo[j]=aux;
                   } 
         System.out.println("Arreglo Ordenado: \n");
         for ( i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
         System.out.println("Arreglo Sin Numeros Repetidos: \n");
         int a1;
         for ( i = 0; i < arreglo.length; i++) {
             if (i==0) {
             System.out.print(arreglo[i]);
             }
             else
             {
                 a1=i-1;
                 aux=arreglo[i];
             if (aux==arreglo[a1]) {
                 
             }else{
                 System.out.print(arreglo[i]);
             }
             }      
        }
    }
}
