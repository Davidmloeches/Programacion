package Variables.EjerciciosVariables;

public class Ej4 {
    public static void main(String[] args) {
        //Ejercicio 4: Conversión de tipos implícita y explícita (de momento, no) Declara una variable long con un valor grande. Convierte este valor en int de forma explícita (cast) y observa el resultado. Luego, convierte un int en long de manera implícita.

        long numero = 2147483648L;
        int numeroInt =(int)numero;
        System.out.println(numero);
        System.out.println(numeroInt);

        // Conversión implícita de int a long
        int valorPequeno = 12345;
        long valorLong = valorPequeno;  // Conversión implícita de int a long
        System.out.println("Valor original en int: " + valorPequeno);
        System.out.println("Valor después de la conversión implícita a long: " + valorLong);
    }
}
