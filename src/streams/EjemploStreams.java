package streams;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
  public static void main(String[] args) {
    List<String> lista = Arrays.asList("Ana", "Luisa", "Merina", "Jhona", "Fiorella");
    ejemploForEach(lista);
    ejemploFilter(lista);

  }

  private static void ejemploFilter(List<String> lista) {
    System.out.println("=Ejemplo de filter=");
    lista.stream()
            .filter(nombre -> nombre.length() >= 4)
            .forEach(System.out::println);
  }

  private static void ejemploForEach(List<String> lista) {
    System.out.println("=Ejemplo de ForEach=");
    lista.stream().forEach(s -> {
      System.out.println(s);
    });
  }
}
