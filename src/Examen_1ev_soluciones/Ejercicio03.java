package Examen_1ev_soluciones;

import java.util.Scanner;

/**
 * @author Ana
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;

            System.out.println("Introduce dos números diferentes entre sí:");
            numero1 = sc.nextInt();
            numero2 = sc.nextInt();
            if (numero1 == numero2) {
                System.out.println("Error: los números introducidos deben ser diferentes.\nVuelve a intentarlo.");
            } else {
                int menor, mayor;
                if (numero1 < numero2) {
                    menor = numero1;
                    mayor = numero2;
                } else {
                    menor = numero2;
                    mayor = numero1;
                }
                for (int i = menor; i <= mayor; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }
    }
}
