package String;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Escribir por pantalla cada carácter de una cadena introducida por teclado.

        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        for (int i = 0; i <= cadena.length() -1; i++) { // recorremos el string desde el primer carácter (primera posción, índice 0) hasta el último (última posición, índice length()-1)
            System.out.print(cadena.charAt(i) + " ");
        }
    }
}
