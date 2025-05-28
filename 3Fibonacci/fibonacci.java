/*
* Write a program that prints the first 50 numbers of the Fibonacci sequence
* starting at 0.
* - The Fibonacci series consists of a sequence of numbers in which
* the next one is always the sum of the two previous ones.
* 0, 1, 1, 2, 3, 5, 8, 13...
-----------------------------------------------------------------------------
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */


 public class fibonacci {
    public static void main(String[] args) {
        int n = 50;
        long a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; ++i) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

   


