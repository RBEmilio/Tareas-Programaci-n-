/* Pide por teclado el nombre, la edad (int) y la estatura en metros (double) de
un deportista. Introduce los datos en una sola línea y léelos con un objeto
Scanner. Muestra los datos por pantalla. */

package actividad2303;

import java.util.Scanner;

public class Deportista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre, la edad y la estatura del deportista separados por espacios:");
        String nombre = scanner.next();
        int edad = scanner.nextInt();
        double estatura = scanner.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
}

