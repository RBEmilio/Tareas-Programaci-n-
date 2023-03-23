/*
Crear con un editor un archivo de texto con un conjunto de números reales,
uno por línea. Abrirlo con un flujo de texto para lectura y leerlo línea a línea.
Convertir las cadenas leídas en números de tipo double por medio de
Scanner, y mostrar al final la suma de todos ellos.
 */
package actividad2303;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LectorArchivos {
    public static void main(String[] args) {
        double suma = 0.0;

        try {
            // Crear archivo de texto con números reales
            File archivo = new File("numeros.txt");
            archivo.createNewFile();

            // Escribir números en el archivo
            java.io.PrintWriter salida = new java.io.PrintWriter(archivo);
            salida.println("3.14");
            salida.println("2.718");
            salida.println("1.414");
            salida.close();

            // Leer archivo y calcular suma
            Scanner entrada = new Scanner(archivo);
            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                double numero = Double.parseDouble(linea);
                suma += numero;
            }
            entrada.close();

            System.out.println("La suma de los números es: " + suma);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}

    