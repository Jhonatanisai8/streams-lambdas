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
    }
}
