package Examen_1ev_soluciones;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opción = 0;
        do {
            System.out.println("Elige una opción:\n1. Sumar números.\n2. Multiplicar números.\n3. Contar números.");
            opción = sc.nextInt();
            switch (opción) {
                case 1:
                    System.out.print("¿Cuántos números vamos a sumar? ");
                    int numeros = sc.nextInt();
                    int suma = 0;
                    int num;
                    System.out.println("Introduce los " + numeros + " números: ");
                    for (int i = 0; i < numeros; i++) {
                        num = sc.nextInt();
                        suma = suma + num;
                    }
                    System.out.println("Suma = " + suma);
                    break;
                case 2:
                    System.out.print("¿Cuántos números vamos a multiplicar? ");
                    numeros = sc.nextInt();
                    int producto = 1;
                    System.out.println("Introduce los " + numeros + " números: ");
                    for (int i = 0; i < numeros; i++) {
                        num = sc.nextInt();
                        producto = producto * num;
                    }
                    System.out.println("Producto = " + producto);
                    break;
                case 3:
                    int contador = 0;
                    num = 0;
                    System.out.println("Introduce números (0 para terminar):");
                    do {
                        num = sc.nextInt();
                        if (num != 0) {
                            contador++;
                        }
                    } while (num != 0);
                    System.out.println("Has introducido " + contador + " números.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        } while(opción < 1 ||opción > 3);
    }
}
