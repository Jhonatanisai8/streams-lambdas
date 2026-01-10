package lambdas.binaryOperator;

import java.util.function.BinaryOperator;

public class EjemploBinaryOperator {
    /*
     * binary-operator:
     * recibe dos valores del mismo tipo y retorne un valor del
     * mismo tipo
     */
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            return a + b;
        };
        System.out.println(binaryOperator.apply(3, 4));
    }
}
