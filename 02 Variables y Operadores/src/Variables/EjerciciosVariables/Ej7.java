package Variables.EjerciciosVariables;

public class Ej7 {
    public static void main(String[] args) {
        //Ejercicio 7: Ejercicio con boolean Declara una variable boolean que sea verdadera si un número int es positivo y falsa si es negativo. Prueba varios valores y muestra los resultados.

        int numero1 = 10;
        boolean esPositivo1 = numero1 > 0;
        System.out.printf("Número: %d, ¿Es positivo? %b%n", numero1, esPositivo1);

        int numero2 = -5;
        boolean esPositivo2 = numero2 > 0;
        System.out.printf("Número: %d, ¿Es positivo? %b%n", numero2, esPositivo2);
    }
}
