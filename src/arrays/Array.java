package arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.SortedMap;

public class Array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Ingresar y mostrar números");
            System.out.println("2. Par o impar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    ingresarYMostrarNumeros(entrada);
                    break;
                case 2:
                    parOImpar(entrada);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

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

    //Programa que pida 6 numeros enteros y posteriormente muestre los numeros con la palabra par o impar
    public static void parOImpar(Scanner entrada){
        int[] paroimpar = new int[6];

        System.out.println("Ingresar 6 digitos: ");

        for(int c = 0 ; c < 6; c++){
            paroimpar[c] = entrada.nextInt();
        }

        for (int c = 0; c < 6; c++ ){
            if (paroimpar[c] % 2 == 0) {
                System.out.println(paroimpar[c] + " Par");
            }else {
                System.out.println(paroimpar[c] + " Impar");
            }


        }

    }

}
