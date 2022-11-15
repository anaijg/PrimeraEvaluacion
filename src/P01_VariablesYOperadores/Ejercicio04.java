package P01_VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
//        Leyendo la página del INE (https://www.ine.es/index.htm) vemos que la variación
//        menusal del IPC es del -0,6% y la anual del 9%.
//        Haz un programa que lea el nombre de un producto y su precio y calcule su precio teniendo en
//        cuenta estos datos variación mensual y la anual. Haz que muestre los datos con dos decimales.

        // declaramos dos constantes para las variaciones mensual y anual
        double VARIACION_MENSUAL = -0.6;
        double VARIACION_ANUAL = 9.0;

        Scanner sc = new Scanner(System.in);
        String producto = sc.nextLine();
        double precio = sc.nextDouble();

        double precioConVariacionMensual = precio + precio * VARIACION_MENSUAL / 100;
        double precioConVariacionAnual = precio + precio * VARIACION_ANUAL / 100;

        System.out.printf("Precio según la variación mensual: %.2f", precioConVariacionMensual);
        System.out.printf("\nPrecio según la variación anual: %.2f", precioConVariacionAnual);


    }
}
