package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio36_27 {
    public static void main(String[] args) {
//        27. Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
//        calificación se compone de los siguientes porcentajes:
//        a. 55% del promedio de sus tres calificaciones parciales.
//        b. 30% de la calificación del examen final.
//        c. 15% de la calificación de un trabajo final.
        // Datos que necesitamos saber:
        Scanner sc = new Scanner(System.in);
//        tres calificaciones parciales.
    // lo convertimos en un for
 /*       System.out.print("Parcial 1: ");
        double parcial1 = sc.nextDouble();
        System.out.print("Parcial 2: ");
        double parcial2 = sc.nextDouble();
        System.out.print("Parcial 3: ");
        double parcial3 = sc.nextDouble();
        // promedio de sus tres calificaciones parciales.
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        //System.out.println(promedioParciales);
*/
        // pido las tres calificaciones parciales con un for
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Parcial " + (i+1) + ": ");
            double parciali = sc.nextDouble();
            suma = suma + parciali;
        }
        double promedioParciales = suma / 3;

        // calificación del examen final.
        System.out.print("Examen final: ");
        double examenFinal = sc.nextDouble();

//        calificación de un trabajo final
        System.out.print("Trabajo final: ");
        double trabajoFinal = sc.nextDouble();


        // Ahora hago los cálculos:


        // ya me queda sólo calcular los porcentajes
        double porcentajeParciales = promedioParciales * 55 / 100;
        //System.out.println(porcentajeParciales);
        double porcentajeExamenFinal = examenFinal * 30 / 100;
        //System.out.println(porcentajeExamenFinal);
        double porcentajeTrabajoFinal = trabajoFinal * 15 / 100;
        //System.out.println(porcentajeTrabajoFinal);

        // La calificación será la suma de los porcentajes que hemos calculado
        double calificaciónFinal = porcentajeParciales + porcentajeExamenFinal + porcentajeTrabajoFinal;
        System.out.printf("La calificación final será %.2f", calificaciónFinal);

    }
}
