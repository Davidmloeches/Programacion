package EstructurasDeControl.If;

import java.util.Scanner;

/*
* Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una cadena que represente una casa (puedes asociarla a un número para hacer más fácil la entrada por teclado) y que obtenga lo siguiente:
    si es "gryffindor" , salida "valentía" ;
    si es "hufflepuff" , salida "lealtad" ;
    si es "slytherin" , salida "astucia" ;
    si es "ravenclaw" , salida "intelecto" ;
    de lo contrario, se muestra "no es una casa válida" .

* */
public class Ej12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Elige una casa poniendo su numero: \n 1- gryffindor \n 2- hufflepuff \n 3- slytherin \n 4- ravenclaw");
        int num = sc.nextInt();

        if (num== 1){
            System.out.println("valentia");
        } else if (num==2) {
            System.out.println("lealtad");
        } else if (num==3) {
            System.out.println("astucia");
        } else if (num == 4) {
            System.out.println("intelecto");
        }else {
            System.out.println("no es una casa valida");
        }


    }
}
