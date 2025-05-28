/*
* Write a function that calculates and returns the factorial of a given number
* recursively.
------------------------------------------------------------------
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */

public class RecursiveFactorial{
        public int factorial(int n){
            if (n == 0 || n== 1){
                return 1;
            } else {
                return n * factorial(n-1);
            }

        }

}

public static void main (String[] args){
    RecursiveFactorial factorial = new RecursiveFactorial();
    int numero = 5;
    int resultado = factorial.factorial(numero);
    System.out.println("El factorial de " + numero + "es: " + resultado);
}