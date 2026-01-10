package lambdas.runnable;

public class EjemploRunnable {
    /*
     * runnable:
     * no recibe valores y no retorna nada
     * solo ejecuta una tarea
     */
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Ejecutando Tarea");
        };
        runnable.run();

    }
}
