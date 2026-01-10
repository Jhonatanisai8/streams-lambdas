package lambdas.biPredicate;

import java.util.function.BiPredicate;

public class EjemploBiPredicate {
    /*
     * bi-predicate:
     * recibe dos valores y devuelve un booleano (true / false)
     */
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> mayorOMenor = (a, b) -> {
            return a > b;
        };
        System.out.println("2 es Mayor  que 1: " + mayorOMenor.test(2, 1));
    }
}
