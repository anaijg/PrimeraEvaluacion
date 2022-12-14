package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
//        25. Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el
//        segundo.
//        Es decir, pedir dos números enteros por teclado e
//        imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.

        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        // ahora tenemos que ver cuál es mayor y cuál menor para montar el for
        // si a es mayor que b, hacemos la suma desde a hasta b
        // pero si b es mayor que a hacemos la suma desde b hasta a
        int suma = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                suma = suma + i;
            }
        } else { // si b es menor o igual que a
            for (int i = b; i <= a; i++) {
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
