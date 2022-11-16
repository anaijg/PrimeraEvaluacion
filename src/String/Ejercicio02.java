package String;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
//        Realizar un programa que comprueba si una cadena leída por teclado comienza por una
//        subcadena introducida también por teclado.
        Scanner sc = new Scanner(System.in);
        // si una cadena leída por teclado
        String cadena = sc.nextLine();
        // comienza por una subcadena introducida también por teclado
        String subcadena = sc.nextLine();
        boolean resulado = cadena.startsWith(subcadena);
        System.out.println("¿\"" + cadena + "\" empieza por \"" + subcadena + "\"? :" + resulado);
    }
}
