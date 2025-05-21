package arrays;
import java.util.Scanner;
import java.util.Arrays;
// Introducir 5 números y mostrarlos en el mismo orden introduccido.


public class Array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] array = new int[5];

        for(int c = 0; c < 5; c++){
            System.out.println("Ingresar el digito " + (c + 1) + ": ");
            array[c] = entrada.nextInt();
        }
        System.out.println("Array es igual a: " + Arrays.toString(array));

        System.out.println("Los numeros introducidos son: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }

    }
}
