package String;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
//        Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina
//        con “burgo”. El programa debe imprimir true o false.

        Scanner sc = new Scanner(System.in);
        // leemos una ciudad
        String ciudad = sc.nextLine();
        // comprobar si termina por "burgo"
        boolean resultado = ciudad.endsWith("burgo");
        System.out.println("¿Termina por \"burgo\"? " + resultado);
    }
}
