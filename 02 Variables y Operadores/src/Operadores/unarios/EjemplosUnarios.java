package Operadores.unarios;

public class EjemplosUnarios {
    public static void main(String[] args) {
        /*
         Se utilizan con una única variable entera
         ++ -> le añade una unidad
         -- -> le quita una unidad
         Importante: se pude utilizar delante o detrás de la variable
         */

        // si se utiliza delante: primero incremente o decrementa y luego hace el resto

        int xVariable = 10;
        System.out.println(++xVariable);// 11 Primero incrementa y luego imprime.

        //si se utiliza detrás de la variable, primero hace lo que sea y luego después lo incrementa
        System.out.println(xVariable++);// 11 Primero imprime y luego incrementa
        System.out.println(xVariable);// 12 Aquí se imprime lo de arriba

        /*
        Para las variables boolean tenemos el operador ! (NOT):
            Cambia el valor de la variable a su opuesto
         */
        boolean encontrado = false;
        System.out.println(encontrado); //false
        //imprimimos lo contrario
        System.out.println(!encontrado); //true


    }
}
