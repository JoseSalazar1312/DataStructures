package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Ingresar y mostrar números");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    ingresarYMostrarNumeros(entrada);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 2);

        entrada.close();
    }

    public static void ingresarYMostrarNumeros(Scanner entrada) {
        int[] array = new int[5];

        for (int c = 0; c < 5; c++) {
            System.out.print("Ingresar el número " + (c + 1) + ": ");
            array[c] = entrada.nextInt();
        }

        System.out.println("Array como texto: " + Arrays.toString(array));

        System.out.println("Los números introducidos son:");
        for (int num : array) {
            System.out.println(num);
        }
    }

}
