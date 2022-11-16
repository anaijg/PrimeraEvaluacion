package String;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
//        Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en
//        cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false.
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();

        // ¿empieza por "J"
        boolean resultado1 = cadena.startsWith("J") || cadena.startsWith("j");
        System.out.println("¿Empieza por J o j?: " + resultado1);

        // otra forma: convirtiendo la cadena a mayúsculas y viendo si empieza por "J" (o, lo mismo, con minúsculas)
        boolean resultado2 = cadena.toUpperCase().startsWith("J");

    }
}
