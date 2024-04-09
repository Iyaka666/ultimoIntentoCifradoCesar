package Model;

public class CaesarAttack {
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

  private char[] createRandomKey(){
    char[] randomKey = {'a','b'};
    return randomKey; 
  }

  public String[] getTextsProbable(){
    String[] textsProbable = {"enuciado","enuciado1"};
    return textsProbable;
  }
}
