package EstructurasDeControl.If;

import java.util.Scanner;

/*
* El director de una escuela está organizando un viaje de estudios, y quiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
    si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
    de 50 a 99 alumnos, el costo es de 70 euros,
    de 30 a 49, de 95 euros,
    y si son menos de 30, el costo del alquiler del autobús es de 4000 euros, sin importar el número de alumnos.
Escribe un programa que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje, si nos dicen el número de alumnos que van de viaje.

* */
public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio = 0;
        int autobus = 0;

        System.out.println("Cuantos alumnos son?");
        int alumnos = sc.nextInt();

        if (alumnos >= 100) {
            precio = 65;
            int precioviaje = alumnos + precio;
            System.out.println("El precio total del viaje es de " + precioviaje + " €");
        } else if (alumnos >= 50 && alumnos <= 99) {
            precio = 70;
            int precioviaje = alumnos + precio;
            System.out.println("El precio total del viaje es de " + precioviaje + " €");
        } else if (alumnos >= 30 && alumnos <= 49) {
            precio = 95;
            int precioviaje = alumnos + precio;
            System.out.println("El precio total del viaje es de " + precioviaje + " €");
        } else if (alumnos <= 30) {
            autobus = 4000;
            int precioviaje = autobus;
            System.out.println("El precio total del viaje es de " + precioviaje + " €");
        }


    }
}
