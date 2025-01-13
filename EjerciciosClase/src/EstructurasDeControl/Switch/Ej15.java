package EstructurasDeControl.Switch;

import java.util.Date;
import java.util.Scanner;

/*
* Realizar un programa que pida un número entero por teclado y visualice el dia de la semana correspondiente.
* */
public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero del (1-7) para saber que dia es:");
        int num = sc.nextInt();

        String dia;
        switch (num){
            case 1:
                dia ="Lunes";
                break;
            case 2:
                dia="Martes";
                break;
            case 3:
                dia="Miercoles";
                break;
            case 4:
                dia="Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia="Numero invalido";
        }

        System.out.println(dia);
    }
}
