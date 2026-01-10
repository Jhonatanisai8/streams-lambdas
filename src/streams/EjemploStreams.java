package streams;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
  public static void main(String[] args) {
    List<String> lista = Arrays.asList("Ana", "Luisa", "Merina", "Jhona", "Fiorella");
    ejemploForEach(lista);
    ejemploFilter(lista);
    ejemploMap(lista);
  }

  private static void ejemploMap(List<String> lista) {
    System.out.println("=Operador Map=");
    lista.stream().map(nombre -> {
      return nombre.toUpperCase();
    }).forEach(System.out::println);
  }

  private static void ejemploFilter(List<String> lista) {
    System.out.println("=Operador filter=");
    lista.stream().filter(nombre -> nombre.length() >= 4).forEach(System.out::println);
  }

  private static void ejemploForEach(List<String> lista) {
    System.out.println("=Operador ForEach=");
    lista.stream().forEach(s -> {
      System.out.println(s);
    });
  }
}
