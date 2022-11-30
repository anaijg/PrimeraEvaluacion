package Examen_1ev_soluciones;

import java.util.Scanner;

/**
 * @author Ana
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota de la P01: ");
        double notaP01 = sc.nextDouble();
        System.out.print("Nota de la P02: ");
        double notaP02 = sc.nextDouble();
        System.out.print("Nota del examen: ");
        double notaExamen = sc.nextDouble();
        double notaPrácticas = (notaP01 + notaP02) / 2;
        double notaEvaluacion = notaPrácticas * (30.0 / 100) + notaExamen * (70.0 / 100);
        System.out.println("=======================");
        System.out.printf("Nota 1ª evaluación: %.2f ", notaEvaluacion);
    }
}
