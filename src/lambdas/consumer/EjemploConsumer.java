package lambdas.consumer;

import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        /*
         * Consumer:
         * recibi un valor y no retorna nada
         */

        Consumer<String> consumer = (parametro) -> {
            System.out.println(parametro);
        };
        consumer.accept("Santiago");

        Consumer<String> consumer2 = (parametro) -> System.out.println(parametro);
        consumer2.accept("Daniel");

        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Flor");

    }
}
