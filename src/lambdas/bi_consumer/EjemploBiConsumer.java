package lambdas.bi_consumer;

import java.util.function.BiConsumer;

public class EjemploBiConsumer {
    public static void main(String[] args) {
        /*
         * Bi-Consumer:
         * recibe dos valores y no retorna nada
         */
        BiConsumer<Integer, String> biConsumer = (habitantes, ciudad) -> {
            System.out.println("Ciudad: " + ciudad + ", Habitantes: " + habitantes);
        };
        BiConsumer<Integer, String> biConsumer2 = (habitantes, ciudad) -> System.out
                .println("Ciudad: " + ciudad + ", Habitantes: " + habitantes);

        biConsumer.accept(12000, "Lima");
        biConsumer2.accept(156000, "Piura");
    }
}
