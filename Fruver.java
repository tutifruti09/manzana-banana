// Se necesita un programa que calcule el total de una compra
// La tienda tiene dos productos manzanas a un precio de $1000 y bananaos a un precio de $800
// los precios son unitarios
// 1. calcule el subtotal de cada producto 
// 2. encuentre el total de la compra sumando los subtotales
// 3. aplique el descuento de 10% 
// 4. calcule el total final

import java.util.Scanner;

public class Fruver {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        final int PRECIO_MANZANA = 1000;
        final int PRECIO_BANANA = 800;
        final double descuent = 0.1;
       

       
       System.out.println("El valor de una manzana es : " + PRECIO_MANZANA);
       System.out.println("Ingrese la cantidad de manzanas que desea comprar:");
       int cantidad1= entrada.nextInt();
       entrada.nextLine();

       System.out.println("\n"); // salto de linea

       System.out.println("El valor de una banana es: " + PRECIO_BANANA);
       System.out.println("Ingrese la cantidad de bananas que desea comprar:");
       int cantidad2= entrada.nextInt();
       entrada.nextLine();

       
       int subtotal_man = multiplicar_man(PRECIO_MANZANA, cantidad1); 
       int subtotal_ban = multiplicar_ban(PRECIO_BANANA, cantidad2); 
       int total_subtotal = suma_sub(subtotal_man, subtotal_ban); 
       
       double descuento = des (total_subtotal, descuent);
       double total_final = fina (total_subtotal, descuento);

       System.out.println("El resultado del subtotal de manzanas es : " + subtotal_man);
       System.out.println("\n");      // salto de linea
       System.out.println("El resultado del subtotal de banano es: " + subtotal_ban);
       System.out.println("\n");      // salto de linea
       System.out.println("El resultado del subtotal sumado es: " + total_subtotal);
       System.out.println("\n");      // salto de linea
       System.out.println("El resultado del descuento es: " + descuento);
       System.out.println("\n");       // salto de linea
       System.out.println("El resultado del total final es: " + total_final);
       System.out.println("\n");       // salto de linea


    }
    public static int multiplicar_man (int preciom, int cantidad1){
        int multiplicacionMan= preciom * cantidad1; 
        return multiplicacionMan;

    }
    public static int multiplicar_ban (int preciob, int cantidad2){
        int multiplicacionBan= preciob * cantidad2;
        return multiplicacionBan;

    }
    public static int suma_sub (int subMan, int subBan){
        int sumaSubtotal = subMan + subBan;
        return sumaSubtotal; 

    }
    public static double des (int totalSub, double porcentaje){
        double des= (totalSub * porcentaje);
        return des;
    }
    public static double fina (int totalSub, double descuento){
        double totalFinal = totalSub - descuento;
        return totalFinal;



    }


} 
