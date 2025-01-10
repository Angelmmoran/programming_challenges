/*
* Create a program that is responsible for transforming a decimal number
* into binary without using language functions that do it directly.
-----------------------------------------------------------------
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class decimalToBinary {
        public static void main (String[] arg){

            toBinary(587);
        }

        public static void toBinary(int number){
            if (number > 1) {
                toBinary(number / 2); 
            }
            System.out.print(number % 2); 
        }
   
    }
