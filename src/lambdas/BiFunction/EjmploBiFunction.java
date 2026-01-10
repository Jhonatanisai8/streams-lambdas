package lambdas.BiFunction;

import java.util.function.BiFunction;

public class EjmploBiFunction {

	public static void main(String[] args) {
		/*
		 * bi-function:
		 * recibe dos valores y retorna un resultado
		 */
		BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
		System.out.println(suma.apply(1, 4));
	}
}
