package condicional_IF;

import java.util.Scanner;

public class EjercicioIf03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 5 numeros: ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        // creo dos variables que van a guardar el maximo y el minimo termporalmente, mientras voy mirando todos los nuemros
        //como empiezo a mirar por el primer numero, ese es temporalmeten el primer numero y mas pequeño de los que ge visto
        int maxTemporal = num;
        int minTemporal = num;

        // ahora el segundo numero
        // si el segundo numero es mayor al temporal se reemplaza
        if (num2>maxTemporal){
            //se remplaza el maxTemporal
            maxTemporal = num2;
            //si el segundo numero no es mayor no se reemplaza por eso no se pone else
        }
        if (num3 > maxTemporal){
            maxTemporal=num3;
        }
        if (num4 > maxTemporal){
            maxTemporal=num4;
        }
        if (num5 > maxTemporal){
            maxTemporal=num5;
        }

        //cuando he terminado de comparar ya el último que se guarda en maxTemporal es el mayor de todos
        System.out.println("El mayor es: "+ maxTemporal);

        //ahora el minimo
        if (num2<minTemporal){
            minTemporal=num2;
        }
        if (num3<minTemporal){
            minTemporal=num3;
        }
        if (num4<minTemporal){
            minTemporal=num4;
        }
        if (num5<minTemporal){
            minTemporal=num5;
        }
        System.out.println("El numero minimo es: "+ minTemporal);

    }
}
