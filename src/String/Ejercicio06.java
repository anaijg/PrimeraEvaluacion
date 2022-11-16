package String;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
//        Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en
//        blanco. El programa debería imprimir true si son iguales, false en caso contrario.

        Scanner sc = new Scanner(System.in);
        // que lea dos cadenas
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();

        // quito los espacios a las dos cadenas
        cadena1 = cadena1.replace(" ", "");
        cadena2 = cadena2.replace(" ", "");

        // las comparo
        System.out.println("a) ¿Son iguales? : " + cadena1.equals(cadena2)); // distinguiendo mayúsculas y minúsculas

        // si me da igual mayúsculas o minúsculas
        System.out.println("b) ¿Son iguales? : " + cadena1.equalsIgnoreCase(cadena2)); // distinguiendo mayúsculas y minúsculas

    }
}
