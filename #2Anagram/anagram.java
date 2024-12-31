/*
* Write a function that receives two words (String) and returns
* true or false (Bool) depending on whether or not they are anagrams.
* - An Anagram consists of forming a word by rearranging ALL
* the letters of another initial word.
* - It is NOT necessary to check that both words exist.
* - Two exactly the same words are not an anagram.
-------------------------------------------------------------------------
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;

public class anagram{
public static boolean areAnagram (String word1, String word2){
    if (word1.equals (word2)){
        return false;
    }

    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    char [] letters1 = word1.toCharArray();
    char [] letters2 = word2.toCharArray();
    Arrays.sort(letters1);
    Arrays.sort(letters2);

    String sortedWord1 = new String (letters1);
    String sortedWord2 = new String (letters2);

    return sortedWord1.equals(sortedWord2);
 }

 public static void main (String[] args){
    String word1 = "amor";
    String word2 = "roma";

    if (areAnagram(word1, word2)) {
        System.out.println(word1 + " and " + word2 + " are anagrams.");
    } else {
        System.out.println(word1 + " and " + word2 + " are not anagrams.");
    } 
 }
}

