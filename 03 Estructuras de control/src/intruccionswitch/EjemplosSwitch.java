package intruccionswitch;

import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accion = sc.nextInt();

        if (accion == 1) {
            System.out.println("comenzando partida");
        } else if (accion == 2) {
            System.out.println("cargando partida");
        } else if (accion == 3) {
            System.out.println("mostrando la ayuda");
        } else if (accion == 4) {
            System.out.println("saliendo");
        } else {
            System.out.println(" accion no prevista");
        }

        // con switch se hace asi:

        switch (accion) { //nombre de la variable
            case 1:
                System.out.println("comenzando una nueva partida");
                break; // si no se pone break se mete en el siguiente case
            case 2:
                System.out.println("cargando una partida guardada");
                break;
            case 3:
                System.out.println("mostrando la ayuda");
                break;
            case 4:
                System.out.println("saliendo");
            default: //en cualquier otro caso...
                System.out.println("accio no prevista");
        }
    }
}
