package EstructurasDeControl.If;

import java.util.Scanner;

/*
 * Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta o no. Suponemos que el año no es bisiesto. Ejemplo: 1-1-2001. Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12. Y el día según el mes que sea estará entre 1 y 31, o entre 1 y 30, o entre 1 y 28.
 * */
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una fecha en este orden 'dia, mes y año': ");
        System.out.println("Dime el dia:");
        int dia = sc.nextInt();
        System.out.println("Dime el mes:");
        int mes = sc.nextInt();
        System.out.println("Dime el año:");
        int anio = sc.nextInt();

        if (anio >= 0) {
            if (mes >= 1 && mes <= 12) {
                if (dia >= 1 && dia <= 31) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("El dia no es correcto");
                }
            } else {
                System.out.println("El mes no es correcto");
            }
        } else {
            System.out.println("El año no es correcto");
        }

    }
}
