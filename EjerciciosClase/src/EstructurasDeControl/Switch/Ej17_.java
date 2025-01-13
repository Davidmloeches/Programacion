package EstructurasDeControl.Switch;

import java.util.Scanner;

/*
* Escribe un programa que responda a un usuario que quiere comprar un helado en una conocida marca de comida rápida cuánto le costará en función del topping que elija.
    El helado sin topping cuesta 1.90€.
    El topping de oreo cuesta 1€.
    El topping de KitKat cuesta 1.50€.
    El topping de brownie cuesta 0.75€.
    El topping de lacasitos cuesta 0.95€.
    En caso de no disponer del topping solicitado por el usuario el programa escribirá por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará del precio del helado sin ningún topping.
Finalmente, el programa escribe por pantalla el precio del helado resultante.
* */
public class Ej17_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1- helado sin topping\n2- topping de oreo\n3- topping de KitKat\n4- topping de brownie \n5- topping de lacasitos\n---------------------------------\nElige uno de estos helados:");
        int num= sc.nextInt();
        double precio;
        switch (num){
            case 1:
                precio=1.90;
                System.out.println("El helado cuesta: "+precio+" €");
                break;
            case 2:
                precio=1;
                System.out.println("El helado cuesta: "+precio+" €");
                break;
            case 3:
                precio=1.50;
                System.out.println("El helado cuesta: "+precio+" €");
                break;
            case 4:
                precio=0.75;
                System.out.println("El helado cuesta: "+precio+" €");
                break;
            case 5:
                precio= 0.95;
                System.out.println("El helado cuesta: "+precio+" €");
                break;
            default:
                System.out.println("no tenemos este topping, lo sentimos.");

        }
    }
}
