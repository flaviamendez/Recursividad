
package mates;
import java.util.ArrayList;

public class Funciones {

    // Ejercicio 1 suma 

    public static int suma(int n) 
    {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    // Ejercicio 2 Factorial

    public static int factorial(int n) 
    {
        if (n == 0) {
            return 1;
            
        } else {
            return n * factorial(n - 1);
        }
    }

    // Ejercicio 3 exponente  

    public static int potencia(int base, int exponente) 
    {
        if (exponente == 0) {
            return 1;

        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    // Ejercicio 4 suma lista 

    public static int sumaLista(ArrayList<Integer> lista) 
    {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return lista.get(0) + sumaLista(new ArrayList<>(lista.subList(1, lista.size())));
        }
    }

    // Ejercicio 5 media aritmética de una lista ce enteros
    public static double mediaAritm(ArrayList<Integer> lista) 
    {
        return (double) sumaLista(lista) / lista.size();
    }

    // Ejercicio 6 desviación típica de una lista 
    public static double desviacionTipica(ArrayList<Integer> lista) 
    {
        double media = mediaAritm(lista);
        return Math.sqrt(desviacionTipicaRecursiva(lista, media) / lista.size());
    }

    private static double desviacionTipicaRecursiva(ArrayList<Integer> lista, double media) {
        if (lista.isEmpty()) {
            return 0;

        } else {
            double diferenciaCuadrado = Math.pow(lista.get(0) - media, 2);
            return diferenciaCuadrado + desviacionTipicaRecursiva(new ArrayList<>(lista.subList(1, lista.size())), media);
        }
    }

    // Ejercicio 7 La suma de los primeros números pares hasta n asumiendo n ≥ 2 
    public static int sumaPares(int n) 
    {
        if (n == 2) {
            return 2;

        } else if (n % 2 == 0) {
            return n + sumaPares(n - 2);
        } else {

            return sumaPares(n - 1);
        }
    }

    // Ejercicio 8 suma de los elementos pares de una lista de enteros 

    public static int sumaParLista(ArrayList<Integer> lista)
    {
        if (lista.isEmpty()) {
            return 0;

        } else {
            int num = lista.get(0);
            int sumaResto = sumaParLista(new ArrayList<>(lista.subList(1, lista.size())));
            if (num % 2 == 0) {
                return num + sumaResto;
            } else {
                return sumaResto;
            }
        }
    }
}


