package Variables.EjerciciosVariables;

public class Ej8 {
    public static void main(String[] args) {
        //Ejercicio 8: Comparación de char y int (de momento, no) Declara una variable de tipo char con el valor 'A' y una de tipo int con el valor de su código ASCII. Compara si son iguales y muestra los resultados.

        char valorChar = 'A';
        int valorAscii = 65;

        boolean valor= valorChar == valorAscii;
        System.out.println(valor);

    }
}
