package lambdas.callable;

import java.util.concurrent.Callable;

public class EjemploCallable {
  /*
   * callable:
   * no recibe valores pero retorna una resultado,
   * puede lanzar una exception
   */
  public static void main(String[] args) {
    Callable<String> callable = () -> {
      return "Hola Mundo";
    };
    try {
      String resultado = callable.call();
      System.out.println(resultado);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
