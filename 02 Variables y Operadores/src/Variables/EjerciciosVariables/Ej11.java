package Variables.EjerciciosVariables;

public class Ej11 {
    public static void main(String[] args) {
        //Ejercicio 11: Operaciones con rangos de variables Declara variables de tipo byte, short, int y long con sus valores máximos y mínimos, e intenta realizar operaciones que excedan esos límites para observar lo que sucede.

        // Declarar variables con valores máximos y mínimos de cada tipo
        byte byteMin = Byte.MIN_VALUE; // -128
        byte byteMax = Byte.MAX_VALUE; // 127

        short shortMin = Short.MIN_VALUE; // -32768
        short shortMax = Short.MAX_VALUE; // 32767

        int intMin = Integer.MIN_VALUE; // -2147483648
        int intMax = Integer.MAX_VALUE; // 2147483647

        long longMin = Long.MIN_VALUE; // -9223372036854775808
        long longMax = Long.MAX_VALUE; // 9223372036854775807

        // Mostrar los valores máximos y mínimos
        System.out.println("byteMin: " + byteMin);
        System.out.println("byteMax: " + byteMax);
        System.out.println("shortMin: " + shortMin);
        System.out.println("shortMax: " + shortMax);
        System.out.println("intMin: " + intMin);
        System.out.println("intMax: " + intMax);
        System.out.println("longMin: " + longMin);
        System.out.println("longMax: " + longMax);

        // Operaciones que exceden los límites de cada tipo
        System.out.println("\nOperaciones excediendo los límites:");

        // Operación en byte que excede su rango
        byte byteOverflow = (byte) (byteMax + 1); // Overflow
        byte byteUnderflow = (byte) (byteMin - 1); // Underflow
        System.out.println("byteMax + 1 (Overflow): " + byteOverflow);
        System.out.println("byteMin - 1 (Underflow): " + byteUnderflow);

        // Operación en short que excede su rango
        short shortOverflow = (short) (shortMax + 1); // Overflow
        short shortUnderflow = (short) (shortMin - 1); // Underflow
        System.out.println("shortMax + 1 (Overflow): " + shortOverflow);
        System.out.println("shortMin - 1 (Underflow): " + shortUnderflow);

        // Operación en int que excede su rango
        int intOverflow = intMax + 1; // Overflow
        int intUnderflow = intMin - 1; // Underflow
        System.out.println("intMax + 1 (Overflow): " + intOverflow);
        System.out.println("intMin - 1 (Underflow): " + intUnderflow);

        // Operación en long que excede su rango
        long longOverflow = longMax + 1; // Overflow
        long longUnderflow = longMin - 1; // Underflow
        System.out.println("longMax + 1 (Overflow): " + longOverflow);
        System.out.println("longMin - 1 (Underflow): " + longUnderflow);
    }
}
