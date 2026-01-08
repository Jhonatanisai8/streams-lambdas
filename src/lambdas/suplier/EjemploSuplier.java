package lambdas.suplier;

import java.util.function.Supplier;

public class EjemploSuplier {
    public static void main(String[] args) {
        /*
         * supplier:
         * no recibe ningun valor
         * pero retorna algo
         */

        Supplier<String> saludo = () -> {
            return "Hola, bienvenido al mundo de Java!.";
        };

        Supplier<Double> numeroRandon = () -> Math.random() * 100 / 100;
        System.out.println(saludo.get());
        System.out.println("Numero randon " + numeroRandon.get());

    }
}
