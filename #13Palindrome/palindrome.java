/*
* Write a function that receives a text and returns true or
* false (Boolean) depending on whether they are palindromes or not.
* A palindrome is a word or expression that is the same if read
* from left to right or from right to left.
* Spaces, punctuation marks and accents are NOT taken into account.
* Example: Ana lleva al oso la avellana.
-------------------------------------------------------------
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
  * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */


public class palindrome{

   public String reverseString(String text){
    StringBuilder reversedText = new StringBuilder(text);
    return reversedText.reverse().toString();
   }
   
   public boolean isPalindrome (String text) {
    String cleanedText = text.replaceAll("[a-Za-Z]","").toLowerCase();
    String reversed = reverseString(cleanedText);
    return cleanedText.equals(reversed);
   }

   
}
    
public static void main (String[] args){

    String text = "Ana lleva al oso la avellana";
    palindrome palindromeChecker = new palindrome();
    boolean result = palindromeChecker.isPalindrome(text);
    
    System.out.println("¿Es palíndromo?" + result);



}


