package practicarMas;

import java.util.Scanner;

public class EjercicioFor09 {
    public static void main(String[] args) {
//        Realiza un programa que comience solicitando al usuario dos números cualesquiera. El programa tendrá que mostrar por pantalla la secuencia completa de números enteros que vayan desde el número menor al mayor de los introducidos. Por ejemplo, si el usuario introduce los números 20 y 12 el programa hará aparecer la siguiente secuencia (uno por línea): 12, 13, 14, 15, 16, 17, 18, 19, 20.
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        // tenemos que determinar cuál es el menor y cuál el mayor
        int menor = 0, mayor = 0;
        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }

        //  mostrar por pantalla la secuencia completa de números enteros que vayan desde el número menor al mayor de los introducidos
        for (int i = menor; i <= mayor; i++) { // también valdría i < 74
            System.out.println(i);
        }
    }
}
