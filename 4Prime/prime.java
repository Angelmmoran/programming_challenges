/*
* Write a program that checks whether a number is prime or not.
* Once this is done, print the prime numbers between 1 and 100.
------------------------------------------------------------
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */


public class prime {
    
    public static boolean isPrime (int num){
            if (num <= 1){
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; 
                }
                
            }
            return true;
        }

       public static void main (String[] args){
        for (int num = 2; num <= 100; num++ ){
            if (isPrime(num)) { 
                System.out.println(num);
            }

           
        }
    }
    }
     
    



