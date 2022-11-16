/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        boolean salir = false;
        //String origen;
        int origen; //Guardaremos la opcion del usuario
        double costo = 0;
        double impuesto = 0; //  10%
        double costo_total;

        System.out.println("Digite la marca del automovil");
        marca = entrada.nextLine();
        /* // Posible segunda solucion
        System.out.println("Digite la marca del automovil");
        origen = entrada.nextLine();
        
        if(origen.equals("Alemania")){
            System.out.println("hola");
        }
*/
        while (!salir) {

            System.out.println("1. Alemania");
            System.out.println("2. Japon");
            System.out.println("3. Italia");
            System.out.println("4. Usa");
            System.out.println("5. Salir");

            System.out.println("Seleccione una de las opciones");
            origen = entrada.nextInt();
            

            System.out.println("Digite el costo del automovil");
            costo = entrada.nextDouble();

            
            
            
            if (origen == 1) {
                impuesto = (costo * 0.20);

            } else {
                if (origen == 2) {
                    impuesto = (costo * 0.30);
                    salir =true;
                }

            }
            if (origen == 3) {
                impuesto = (costo * 0.15);
                salir =true;

            } else {
                if (origen == 4) {
                    impuesto = (costo * 0.8);

                }else{
                
                    salir =true;
                }

            }

        }
        costo_total = costo + impuesto;
        System.out.printf("El impuesto por pagar es: %.1f\nel precio venta"
                + " incluido impuesto es de: %.1f\n", impuesto,costo_total);
        //System.out.println("Costo auto es : "+costo);
        //System.out.println("Impuesto a pagar es : "+impuesto);
       // System.out.println("Costo total del auto es : "+costo_total);

    }

}
