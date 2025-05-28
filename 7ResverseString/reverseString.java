/*
* Create a program that reverses the order of a text string
* without using language functions that do it automatically.
* - If we pass it "Hello world" it would return "dlrow olleH"
----------------------------------------------------------------------------------
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class reverseString{

public static void  main (String[] args) {

    String phrase = "Hello World";
    String reversed = reverse(phrase);
    System.out.println (reversed);
    
}


public static String reverse (String phrase){
        String reversed = "";
            for(int i = phrase.length() -1; i >= 0; i--){  
                reversed += phrase.charAt(i);

        }

    return reversed;
        
}

}

