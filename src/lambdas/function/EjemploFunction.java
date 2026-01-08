package lambdas.function;

import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        /*
         * Function:
         * recibe un valor y retorna un resultado
         */
        Function<Integer, Double> raizCuadrada = (numero) -> {
            return Math.sqrt(numero);
        };

        Integer numero = 16;

        System.out.println("Raiz Cuadrada de " + numero + " es " + raizCuadrada.apply(numero));
    }
}
