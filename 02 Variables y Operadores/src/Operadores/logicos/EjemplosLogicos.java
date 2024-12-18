package Operadores.logicos;

public class EjemplosLogicos {
    public static void main(String[] args) {
        //se utilizan para los boolean
        boolean encendido = false;
        System.out.println("encendido: "+ encendido);
        boolean enchufado = false;
        System.out.println("enchufado: "+ enchufado);


        //! se traduce por NOT, asigna el valor contrario
        // Ej si es true , se pone false
        System.out.println(!encendido); //da true
        System.out.println(!enchufado); // da true

        //&& se traduce por AND, quiere decir "esto y lo otro"
        // solo devuelve true si ambos operandos si los 2 son true
        // en los demas casos son false

        encendido = true;
        enchufado = true;
        System.out.println("true && true: "+ (encendido && enchufado));

        encendido = true;
        enchufado = false;
        System.out.println("true && false: "+ (encendido && enchufado));

        // || OR, significa "o esto, o lo otro, o ambos"
        //es false cuando ambas variables son false ("ni esto, ni lo otro")
        //en el resto de los casos es true, con que uno de los dos ya sea true
        encendido = false;
        enchufado = true;
        System.out.println("false || true: "+ (encendido || enchufado));
    }
}
