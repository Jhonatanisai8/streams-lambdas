# Java Streams & Lambdas Practice

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Learning-green?style=for-the-badge)

Este repositorio contiene una colección de ejemplos y ejercicios prácticos enfocados en el dominio de la **Programación Funcional** en Java, específicamente utilizando **Expresiones Lambda** y la **Stream API**.

## 🎯 Objetivo
El propósito de este proyecto es demostrar la transición de un estilo de programación imperativo a uno declarativo, mejorando la legibilidad, mantenibilidad y eficiencia del código Java.

---

## 📚 Temas Cubiertos

* **Expresiones Lambda:** Sintaxis y simplificación de interfaces funcionales.
* **Interfaces Funcionales Core:** Uso de `Predicate`, `Consumer`, `Function` y `Supplier`.
* **Pipeline de Streams:**
    * **Operaciones Intermedias:** `filter()`, `map()`, `flatmap()`, `sorted()`, `distinct()`.
    * **Operaciones Terminales:** `collect()`, `forEach()`, `reduce()`, `count()`, `anyMatch()`.
* **Method References:** Uso eficiente de `System.out::println` y constructores.
* **Optional:** Manejo profesional de valores nulos dentro de flujos de datos.

## 💻 Ejemplos de Código

### Filtrado y Transformación
```java
// Filtrar nombres que empiezan con "J" y convertirlos a mayúsculas
List<String> resultado = nombres.stream()
    .filter(n -> n.startsWith("J"))
    .map(String::toUpperCase)
    .collect(Collectors.toList());
