/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costo_kilovatio;
        double consumo_kilovatios;
        double costo;
        double costo_total;
        int edad = 61;
        double descuento; //  10%

        System.out.println("Digite el costo Kw/h");
        costo_kilovatio = entrada.nextDouble();

        System.out.println("Digite numero de Kw consumidos");
        consumo_kilovatios = entrada.nextDouble();
        
        costo = costo_kilovatio * consumo_kilovatios;
        
        if(edad >65 ){
           descuento = (costo *10 ) /100 ; 
           costo_total = costo - descuento;
            
           System.out.println("El total a cancelar es: "+ costo_total);
        
        }else{
        
           System.out.println("El total a cancelar es: "+ costo);
        } 
            
    }

}
