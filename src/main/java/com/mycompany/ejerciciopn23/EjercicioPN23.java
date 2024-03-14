package com.mycompany.ejerciciopn23;
import java.util.Scanner;
public class EjercicioPN23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        double discriminante = B * B - 4 * A * C;
        
        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("La ecuación tiene dos soluciones reales distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -B / (2 * A);
            System.out.println("La ecuación tiene una solución real doble:");
            System.out.println("x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        scanner.close();
    }
}
