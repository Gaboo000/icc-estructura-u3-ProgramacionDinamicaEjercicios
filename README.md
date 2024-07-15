

author: Gabriel Segarra
tag version: V3.2.1


Ejercicios Programacion Dinamica 

ejercicio Uno:
crear un metodo que devuelva los subconjuntos de un arreglo de enteros 

ejercicio Dos:
Implementacion de un algoritmo para generar combinaciones de parentesis 



     
# Dynamic Programming

## Getting Started

This project is a practical exercise on how to implement the Fibonacci sequence using different methods in Java. It demonstrates the basic recursive approach and two caching techniques (using a `Map` and an array) to optimize the computation.

This repository refers to the third unit of Dynamic Programming, focusing on the optimization of recursive algorithms.

## Requirements
- Java JDK 11 or higher
- Git 2.20 or higher

## Definition of Dynamic Programming

Dynamic Programming (DP) is a method for solving complex problems by breaking them down into simpler subproblems. It is particularly useful when the problem has overlapping subproblems and optimal substructure, allowing the reuse of previously computed results to improve efficiency.

## StringBuilder

`StringBuilder` is a mutable sequence of characters. Unlike `String`, which is immutable, `StringBuilder` can be modified without creating new objects, making it more efficient for operations that require frequent modifications, such as concatenations in loops.

### Example of StringBuilder Usage

Here's a simple example demonstrating the use of `StringBuilder`:

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        
        System.out.println(sb.toString()); // Outputs "Hello World!"
    }
}
```

In this example, `StringBuilder` is used to concatenate strings efficiently.

## Implementation

### Normal Recursive Method

The basic recursive method for computing the Fibonacci sequence without any caching.

```java
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

### First Caching Method: Using a Map

This method uses a `Map` to store previously computed values, reducing redundant calculations.

```java
private static Map<Integer, Integer> cache = new HashMap<>();

public static int fibonacciWithCaching(int n) {
    if (n <= 1) {
        return n;
    }

    if (cache.containsKey(n)) {
        return cache.get(n);
    }

    int result = fibonacciWithCaching(n - 1) + fibonacciWithCaching(n - 2);
    cache.put(n, result);
    return result;
}
```

### Second Caching Method: Using an Array

This method uses an array to store previously computed values, which is typically more efficient in terms of access time and memory usage.

```java
// Method to calculate the n-th Fibonacci number
public static int fibonacciCaching(int n) {
    int[] cache = new int[n + 1]; // Using an array to store previously computed results
    return fibonacciMemoria(n, cache);
}

// Helper method to calculate the n-th Fibonacci number using memoization
private static int fibonacciMemoria(int n, int[] cache) {
    if (n <= 1) {
        return n;
    }

    // If the value was previously calculated, return it from the cache
    if (cache[n] != 0) {
        return cache[n];
    }
    // If the value was not calculated, compute it recursively and store it in the cache
    cache[n] = fibonacciMemoria(n - 1, cache) + fibonacciMemoria(n - 2, cache);
    return cache[n];
}
```

## Ejercicios

### Ejercicio 1

```java
package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios métodos 
 * 
 * Escoja la mejor estructura de datos para que sea más eficiente
 */
public class EjercicioUno {

    // List<List<Integer>> subsets(List<Integer> set) {

    // }
}
```

### Ejercicio 2

```java
package Ejercicio;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Escoja la mejor estructura de datos para que sea más eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {

    // List<List<Integer>> subsets(List<Integer> set) {

    // }
}
```

## Contribute

To contribute to this project, please create a fork and send a pull request, or simply open an issue with your comments and suggestions.

## Authors

- [PABLO TORRES] - Initial development
