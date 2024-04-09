package Model;

public class CaesarAttack implements Desencrypter{
  private String text;
  private Pronoums pronoums;
  private VerbsAuxiliars verbs;

  public CaesarAttack(String text){
    setText(text);
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text.toLowerCase();
  }

  private int getRandom(int limitTop, int limitBottom){
    return (int)Math.round( Math.random() * (limitBottom - limitTop) + limitTop );
  }

  private char[] createRandomKey(){
    char[] randomKey = {(char)getRandom(122, 97), (char)getRandom(122,97)};
    return randomKey; 
  }

  @Override
  public String descipher(String textEncrypted){
    
    return "";
  }

  public String[] getTextsProbable(){
    String[] textsProbable = {"enuciado","enuciado1"};

    return textsProbable;
  }
}
