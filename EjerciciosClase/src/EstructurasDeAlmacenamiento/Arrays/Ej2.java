package EstructurasDeAlmacenamiento.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
* Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.
 * */
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] ints= new int[5];

        System.out.println("Dime 5 numeros decimales: ");
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Dime el "+ (i+1)+" numero: ");
            int num = sc.nextInt();
            ints[i]= num;
        }
        System.out.println(Arrays.toString(ints));
        //falta introducirlo al revés

    }
}
