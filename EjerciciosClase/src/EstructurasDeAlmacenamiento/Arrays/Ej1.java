package EstructurasDeAlmacenamiento.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
* Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
* */
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] doubles= new double[5];


        System.out.println("Dime 5 numeros: ");
        for (int i = 0; i < 5; i++) {
        double num = sc.nextDouble();
        doubles[i]= num;

        }
        System.out.println(Arrays.toString(doubles));

    }
}
