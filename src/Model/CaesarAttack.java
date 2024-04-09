package Model;

public class CaesarAttack{
  private String text;

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

  public String[] getTextsProbable(int limit){
    String[] textsProbable = new String[limit];
    return textsProbable;
  }
}
