/*
* Create a program that is capable of transforming natural text into Morse code
* and vice versa.
* - It must automatically detect what type it is and perform
* the conversion.
* - Morse supports a dash "—", a period ".", a space " " between letters
* or symbols and two spaces between words " ".
* - The supported Morse alphabet will be the one shown in
* https://es.wikipedia.org/wiki/Código_morse.
----------------------------------------------------------------
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Morse {
    
    private static final Map<String, String> MORSE_CODE_DICT = new HashMap<>();

    static {
        MORSE_CODE_DICT.put("A", ".-");
        MORSE_CODE_DICT.put("B", "-...");
        MORSE_CODE_DICT.put("C", "-.-.");
        MORSE_CODE_DICT.put("D", "-..");
        MORSE_CODE_DICT.put("E", ".");
        MORSE_CODE_DICT.put("F", "..-.");
        MORSE_CODE_DICT.put("G", "--.");
        MORSE_CODE_DICT.put("H", "....");
        MORSE_CODE_DICT.put("I", "..");
        MORSE_CODE_DICT.put("J", ".---");
        MORSE_CODE_DICT.put("K", "-.-");
        MORSE_CODE_DICT.put("L", ".-..");
        MORSE_CODE_DICT.put("M", "--");
        MORSE_CODE_DICT.put("N", "-.");
        MORSE_CODE_DICT.put("O", "---");
        MORSE_CODE_DICT.put("P", ".--.");
        MORSE_CODE_DICT.put("Q", "--.-");
        MORSE_CODE_DICT.put("R", ".-.");
        MORSE_CODE_DICT.put("S", "...");
        MORSE_CODE_DICT.put("T", "-");
        MORSE_CODE_DICT.put("U", "..-");
        MORSE_CODE_DICT.put("V", "...-");
        MORSE_CODE_DICT.put("W", ".--");
        MORSE_CODE_DICT.put("X", "-..-");
        MORSE_CODE_DICT.put("Y", "-.--");
        MORSE_CODE_DICT.put("Z", "--..");
        MORSE_CODE_DICT.put("0", "-----");
        MORSE_CODE_DICT.put("1", ".----");
        MORSE_CODE_DICT.put("2", "..---");
        MORSE_CODE_DICT.put("3", "...--");
        MORSE_CODE_DICT.put("4", "....-");
        MORSE_CODE_DICT.put("5", ".....");
        MORSE_CODE_DICT.put("6", "-....");
        MORSE_CODE_DICT.put("7", "--...");
        MORSE_CODE_DICT.put("8", "---..");
        MORSE_CODE_DICT.put("9", "----.");
        MORSE_CODE_DICT.put(".", ".-.-.-");
        MORSE_CODE_DICT.put(",", "--..--");
        MORSE_CODE_DICT.put("?", "..??..");
        MORSE_CODE_DICT.put("!", "-.-.--");
        MORSE_CODE_DICT.put("-", "-....-");
        MORSE_CODE_DICT.put("/", "-..-.");
        MORSE_CODE_DICT.put("@", ".--.-.");
        MORSE_CODE_DICT.put("(", "-.--.");
        MORSE_CODE_DICT.put(")", "-.--.-");
        MORSE_CODE_DICT.put(" ", " ");
    }


    public static String textToMorse (String text){
        text = text.toUpperCase();
        StringBuilder morse = new StringBuilder();
        for (char letter : text.toCharArray()){
            String code = MORSE_CODE_DICT.get(String.valueOf(letter));
            if (code != null){
                morse.append(code).append(" ");
            }else {
                morse.append(letter).append (" ");
            }
        }
        return morse.toString().trim();
    }

    public static String morseToText (String morse){
        Map<String, String> morseToTextDict = new HashMap<>();
        for (Map.Entry<String, String> entry : MORSE_CODE_DICT.entrySet()){
            morseToTextDict.put(entry.getValue(), entry.getKey());
        }

        StringBuilder text = new StringBuilder();
        String[] words = morse.split("  ");
        for (String word : words){
            String[] letters = word.split(" ");
            for (String letter : letters){
                String character = morseToTextDict.get(letter);
                if (character != null){
                    text.append(character);
                } else {
                    text.append(letter);
                }
            }
            text.append(" ");
        }
        return text.toString().trim();
    }

    public static String detectAndConvert(String entry){
        Pattern morsePattern = Pattern.compile("^[.\\- ]+$");
        Matcher morsMatcher = morsePattern.matcher(entry);

        if (morsMatcher.matches()){
            return morseToText(entry);
        }else {
            return textToMorse(entry);
        }
    }

    public static void main (String[] args){
        String text ="Hello World";
        String morse = detectAndConvert(text);
        System.out.println("Text to Morse:" + morse);

        String transcribedText = detectAndConvert(morse);
        System.out.println("Morse to text:" + transcribedText);

    }


















}
