/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        int dias;
        double precio_dia;
        //double precio_unidad;
        double descuento; //  10%
        double costo_total;
        double costo;

        System.out.println("Digite # dias a hospedarse");
        dias = entrada.nextInt();

        System.out.println("Digite precio x dia");
        precio_dia = entrada.nextInt();
        
        costo = dias * precio_dia;
        
        if(dias > 5){
           descuento = (costo *10 ) /100 ; 
           costo_total = costo - descuento;
           
           System.out.println("El descuento es: "+ descuento); 
           System.out.println("El Subtotal a cancelar es: "+ costo);
           System.out.println("El total a cancelar es: "+ costo_total);
        
        }else{
        
           System.out.println("El total a cancelar es: "+ costo);
           
        if(dias > 10){
           descuento = (costo *15 ) /100 ; 
           costo_total = costo - descuento;
           
            
           System.out.println("El Subtotal a cancelar es: "+ costo);
           System.out.println("El descuento es: "+ descuento);
           System.out.println("El total a cancelar es: "+ costo_total);
        
        }
        if(dias > 15){
           descuento = (costo *12 ) /100 ; 
           costo_total = costo - descuento;
           
           System.out.println("El descuento es: "+ descuento); 
           System.out.println("El Subtotal a cancelar es: "+ costo);
           System.out.println("El total a cancelar es: "+ costo_total);
        
        }
    }
    }
    
}
