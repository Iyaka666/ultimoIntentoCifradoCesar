package Model;
public class CaesarCipher {

  private CaesarCipher(){}

  public static String encrypt(String text, int key) {

    StringBuilder textEncrypt = new StringBuilder();  
  
    for (char character : text.toCharArray()) {
    
      if (Character.isLetter(character)) {
        boolean upper = Character.isUpperCase(character);
        character = Character.toLowerCase(character);
        int code = character - 'a';
        int codeEncrypt = (code + key) % 26;
        char characterEncrypt = (char) (codeEncrypt + 'a');
    
      if (upper) {
        characterEncrypt = Character.toUpperCase(characterEncrypt);
      }
      textEncrypt.append(characterEncrypt);
      } else {
        textEncrypt.append(character);
      }
}
return textEncrypt.toString();
}

  public static String desencrypt(String textEncrypt, int key) {
    
    StringBuilder textDesencrypt = new StringBuilder();
    
    for (char character : textEncrypt.toCharArray()) {
      
      if (Character.isLetter(character)) {
        boolean upper = Character.isUpperCase(character);
        character = Character.toLowerCase(character);
        int code = character - 'a';
        int codeDesencrypt = (code - key) % 26;
      
        if (codeDesencrypt < 0) {
        codeDesencrypt += 26; // Manejo de números negativos
        }
      
      char characterDesencrypt = (char) (codeDesencrypt + 'a');
      
      if (upper) {
          characterDesencrypt = Character.toUpperCase(characterDesencrypt);
      }
      textDesencrypt.append(characterDesencrypt);
      } else {
        textDesencrypt.append(character);
      }
    }
    return textDesencrypt.toString();
}
}