package String;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
//        Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la
//        letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena resultante.
        Scanner sc = new Scanner(System.in);
        // leemos la cadena de texto
        String cadena = sc.nextLine();
        // reemplazamos todas las apariciones de "a" por "b", y guardamos el resultado en la misma variable
        cadena = cadena.replace("a", "b");
        // imprimimos la cadena resultante
        System.out.println(cadena);

    }
}
