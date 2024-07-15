package Ejercicio;

import java.util.ArrayList;
import java.util.List;

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
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll(new StringBuilder(), 0, 0, n, result);
        return result;
    }


    private void generateAll(StringBuilder current, int open, int close, int max, List<String> result) {
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        if (open < max) {
            current.append('(');
            generateAll(current, open + 1, close, max, result);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(')');
            generateAll(current, open, close + 1, max, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
    public List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>> subsets = new ArrayList<>();
        // Comenzamos con el conjunto vacío
        subsets.add(new ArrayList<>());
        
        for (int num : set) {
            // Tomamos una instantánea del tamaño actual de los subconjuntos
            int tamañoActual = subsets.size();
            
            for (int i = 0; i < tamañoActual; i++) {
                // Para cada subconjunto actual, creamos uno nuevo que incluye el número actual
                List<Integer> newSubset = new ArrayList<>(subsets.get(i));
                newSubset.add(num);
                subsets.add(newSubset);
            }
        }
        
        return subsets;
    }


    
}
