// Calcular sueldo bruto y neto, sabiendo que:
//-Sueldo fijo
//-Comisión: 5% sobre el importe total de ventas
//-Kilometraje: 2€/km
//-Dietas: 30€/dia de desplazamiento
//--------------------------------------
//Para calcular el neto hay que descontarle al bruto:
//IRPF= 18% sueldo total
//Retención SC 36€

package bol3_5;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        System.out.print("Introduce tu sueldo fijo: ");
        
        Scanner scanFijo = new Scanner (System.in);
        double sueldoFijo = scanFijo.nextDouble();
        
        
        System.out.print("Introduce el precio de uno de tus productos: ");
        
        Scanner scanPrecio = new Scanner (System.in);
        double precioProducto = scanPrecio.nextDouble();
        
        
        System.out.print("Introduce la cantidad de productos que has vendido: ");
        
        Scanner scanProductos = new Scanner (System.in);
        double numeroProductos = scanProductos.nextDouble();
       
        
        System.out.print("Introduce los kilómetros que recorres hasta tu lugar de trabajo: ");
        
        Scanner scanKm = new Scanner (System.in);
        double km = scanKm.nextDouble();
        
        
        System.out.print("Introduce los días que te has desplazado a tu lugar de trabajo: ");
        
        Scanner scanDias = new Scanner (System.in);
        double dias = scanDias.nextDouble();
        scanDias.close();
        
        double bruto = sueldoFijo + ((precioProducto*numeroProductos)*0.05)+km*2+dias*30;
        
        double neto = bruto - 36 - (0.18*bruto);
        
        System.out.println("Tu sueldo bruto asciende a "+bruto+"€ y percibes "+neto+"€ como sueldo neto."); 
        
        
        
    }
}
