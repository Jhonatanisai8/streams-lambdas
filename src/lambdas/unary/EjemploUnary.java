package lambdas.unary;

import java.util.function.UnaryOperator;

public class EjemploUnary {
    /*
     * UnaryOperator:
     * Recibe un valor, lo procesa
     * y devuelve un resultado del mismo
     * tipo
     */
    public static void main(String[] args) {
        UnaryOperator<Integer> sumUnaryOperator = (a) -> a * a;
        System.out.println(sumUnaryOperator.apply(5));
    }
}
