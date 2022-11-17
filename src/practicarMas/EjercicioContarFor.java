package practicarMas;

import java.util.Scanner;

public class EjercicioContarFor {
    public static void main(String[] args) {
        //Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
        //números a introducir). El programa debe informar de cuantos números introducidos
        //son mayores que 0, menores que 0 e iguales a 0.

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a introducir?: ");
        int numerosAIntroducir = sc.nextInt();

        // tengo que pedir los números que he dicho:
        int numero = 0;
        // necesito tres contadores:
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        for (int i = 0; i < numerosAIntroducir; i++) {
            System.out.print("Número: ");
            numero = sc.nextInt();
            // compruebo si es positivo, negativo o 0
            if (numero > 0) {
                contadorPositivos++; // contadorPositivos += 1 o bien contadorPositivos = contadorPositivos + 1;
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }
        System.out.println("Positivos: " + contadorPositivos);
        System.out.println("Negativos: " + contadorNegativos);
        System.out.println("Ceros: " + contadorCeros);
    }
}
