package lambdas.predicate;

import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        /*
         * predicate:
         * recibe un valor y devuelve un boleano (true o falso)
         */
        Predicate<Integer> predicate = (edad) -> {
            return edad >= 18;
        };
        Predicate<String> empiezaConA = (edad) -> edad.charAt(0) == 'a' || edad.charAt(0) == 'A' ;
        System.out.println("Es Mayor de edad: " + predicate.test(19));
        System.out.println("Empieza con A: " + empiezaConA.test("Amenaza"));
    }
}
