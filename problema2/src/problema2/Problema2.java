/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        int cantidad;
        double costo;
        double precio_unidad;
        double descuento; //  10%
        double costo_total ;

        System.out.println("Digite el costo del articulo");
        precio_unidad = entrada.nextDouble();

        System.out.println("Digite la cantidad que desea del articulo");
        cantidad = entrada.nextInt();
        
        costo = precio_unidad * cantidad;
        
        if(cantidad > 50 ){
           descuento = (costo *15 ) /100 ; 
           costo_total = costo - descuento;
            
           System.out.printf("El costo del pedido es: %.1f, la cantidad"
                   + " requerida es: %d, y el precio por unidad es: %.1f"
                   , costo_total, cantidad, precio_unidad);
        
        }else{
        
           System.out.printf("El costo del pedido es: %.1f\nla cantidad"
                   + " requerida es: %d\ny el precio por unidad es: %.1f\n"
                   , costo, cantidad, precio_unidad);
    }
    
}
}