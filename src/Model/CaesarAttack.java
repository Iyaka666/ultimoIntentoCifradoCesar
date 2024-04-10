package Model;

import java.util.Map;
import java.util.HashMap;

public class CaesarAttack {
  private String textEncrypt;
  private String lettersMoreUseInEnglish;
  private String alphabeth;

  public CaesarAttack(String textEncrypt, String alphabeth, String letterMoreUse){
    this.textEncrypt = textEncrypt;
    this.alphabeth = alphabeth;
    this.lettersMoreUseInEnglish = "ETAOINSHRDLCUMWFGYPBVKJXQZ";
  }

  public String getTextEncrypt() {
    return textEncrypt;
  }
  
  public void setTextEncrypt(String textEncrypt) {
    this.textEncrypt = textEncrypt;
  }
  
  // Método para calcular la frecuencia de las letras en el texto
  private Map<Character, Integer> calculatefrequecyLetters() {
    
    Map<Character, Integer> frequecyLetters = new HashMap<>();
    
    for (char character : this.textEncrypt.toCharArray()) {
      if (Character.isLetter(character)) {
        character = Character.toUpperCase(character);
        frequecyLetters.put(character, frequecyLetters.getOrDefault(character, 0) + 1);
      }
    }
    
    return frequecyLetters;
  }
  
  // Método para encontrar la letra más común en el texto
  private char findLetterMoreCommon(Map<Character, Integer> frequecyLetters) {
    
    int maxFrequency = 0;
    
    char letterMoreCommon = ' ';
    
    for (Map.Entry<Character, Integer> entry : frequecyLetters.entrySet()) {
      if (entry.getValue() > maxFrequency) {
        maxFrequency = entry.getValue();
        letterMoreCommon = entry.getKey();
      }
    }
    
    return letterMoreCommon;
  }
  
  // Método para calcular el desplazamiento
  private int calculateShift(char letterEncrypt, char letterOrigin) {
    return (letterEncrypt - letterOrigin + alphabeth.length()) % alphabeth.length();
  }
  
  public String getTextsProbable(){
    // Calcular la frecuencia de las letras en el texto cifrado
    Map<Character, Integer> frecuenciaLetras = calculatefrequecyLetters();
    // Letra más común en el texto cifrado
    char letraMasComun = findLetterMoreCommon(frecuenciaLetras);
    // Calcular el desplazamiento
    int desplazamiento = calculateShift(letraMasComun, 'E');
    // Descifrar el texto cifrado con el desplazamiento calculado
    String textoDescifrado = CaesarCipher.desencrypt(this.textEncrypt, desplazamiento);
    return textoDescifrado; 
  }
}