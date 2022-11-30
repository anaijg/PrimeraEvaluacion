package Examen_1ev_soluciones;

import java.util.Scanner;

/**
 * @author Ana
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Presión atmosférica: ");
        char presión = sc.next().charAt(0);
        System.out.print("Humedad: ");
        char humedad = sc.next().charAt(0);

        String probabilidadDeLluvia;
        if (presión == 'B' && humedad == 'A') {
            probabilidadDeLluvia = "media";
        } else if (presión == 'B' && humedad == 'M') {
            probabilidadDeLluvia = "alta";
        } else if (presión == 'B' && humedad == 'B') {
            probabilidadDeLluvia = "media";
        } else if (presión == 'M' && humedad == 'M') {
            probabilidadDeLluvia = "media";
        } else {
            probabilidadDeLluvia = "baja";
        }

        System.out.println("================================");
        System.out.println("Probabilidad de lluvia: " + probabilidadDeLluvia);
    }
}
