package EstructurasDeControl.If;

import java.util.Scanner;

/*
 * Escribe un programa que lea un año e indique si es bisiesto. Nota: un año es bisiesto si es divisible por 4, y no es divisible por 100, excepto que también sea divisible por  400.
 * */
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un año para calcular si es bisiesto: ");
        int año = sc.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }


    }
}
