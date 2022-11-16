package String;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class EjemplosString {
    public static void main(String[] args) {
        String cadena = new String("Hola"); // esto se puede poner así, pero es largo
        String cadena2 = "Hola"; // String es el único tipo referencia en que te puedes saltar el new al crear una variable de ese tipo

        Scanner sc = new Scanner(System.in);


        String ejemplo = "esternocleidomastoideo";
        // podemos acceder a sus caracteres indicando el índice (la posición) en la que están
        System.out.println(ejemplo.charAt(0)); // es la letra que está en la posición 0 de palabra (la 1ª)
        System.out.println(ejemplo.charAt(10)); // es la letra que está en la posición 10 de la palabra (la 11ª)

        // Métodos
        // Para saber la longitud del String
        System.out.println("***************************************************");
        System.out.println("**********       MÉTODOS CON STRING        ********");
        System.out.println("***************************************************");
        System.out.println("Longitud: " + ejemplo.length());
        System.out.println("¿Está vacía? " + ejemplo.isEmpty());
        String vacía = "";
        System.out.println("¿Está vacía? " + vacía.isEmpty());
        System.out.println("Todo en mayúsculas: " + ejemplo.toUpperCase());
        System.out.println("Todo en minúsculas: " + ejemplo.toLowerCase());
        System.out.println("¿Termina con \"toideo\"? " + ejemplo.endsWith("toideo"));
        System.out.println("¿Empieza con \"pla\"? " + ejemplo.startsWith("pla"));
        System.out.println("¿Contiene \"cleido\"? " + ejemplo.contains("cleido"));
        System.out.println("Subcadena: " + ejemplo.substring(3, 8)); // posición final le tienes que decir una más de la que quieres
        System.out.println("Sustituye e por i: " + ejemplo.replace("e", "i"));
        String conEspacios = "        tititititit       ";
        System.out.println("Longitud: " + conEspacios.length() + " String: " + conEspacios);
        String sinEspacios = conEspacios.trim();
        System.out.println("Longitud: " + sinEspacios.length() + " String: " + sinEspacios);
        System.out.println("Comparar con equalsIgnoreCase: ");
        String minúsculas = "segunda";
        String mayúsculas = "SEGUNDA";
        System.out.println("Con equals: " + minúsculas.equals(mayúsculas));
        System.out.println("Con equalsIgnoreCase: " + minúsculas.equalsIgnoreCase(mayúsculas));


        // Tamaño de un string
        String str = "Hola";
        System.out.println("Tamaño = " + str.length());
        System.out.println("Último carácter del string: " + str.charAt(str.length() - 1));

        // Eliminar espacios en blanco
        String frase = "El examen es el lunes";
        frase = frase.replace(" ", "");
        System.out.println(frase);



    }
}
