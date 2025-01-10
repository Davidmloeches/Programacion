package EstructurasDeControl.If;

import java.util.Scanner;

public class Ej1 {
    /*
     * Escribe un programa que pida un número e indique si es par o impar (un número es par si al dividirlo entre 2 el resto es 0).
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero para saber si es par o impar");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }
}
