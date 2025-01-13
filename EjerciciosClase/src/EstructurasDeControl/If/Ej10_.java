package EstructurasDeControl.If;

import java.util.Scanner;

/*
* La asociación de vinicultores quiere fijar el precio del kilo de uva, la cual se clasifica en dos tipos: A y B. Además, cada tipo de uva se clasifica en dos tamaños: 1 y 2. Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:
    Preguntamos por el precio inicial del kilo de uva y el número de kilos que se van a cargar.
    Si la uva es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
    Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

* */
public class Ej10_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el precio inical del kilo de uva?");
        int kginicial = sc.nextInt();

        System.out.println("Cual es el nuemro de kilos que quieres encargar?");
        int numkg = sc.nextInt();





    }
}
