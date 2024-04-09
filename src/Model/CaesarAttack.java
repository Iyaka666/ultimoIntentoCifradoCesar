package Model;

public class CaesarAttack{
  private String text;
  private final char [] moreUseLetter = "ETAONIHSRLDUCMWYFGPBVKJXQZ".toLowerCase().toCharArray();
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

  public String[] getTextsProbable(int limit){
    String[] textsProbable = new String[limit];
    Pronoums[] otherPron = Pronoums.values();
    VerbsAuxiliars[] otherVerbs = VerbsAuxiliars.values();
    
    
    // for(Object object : otherPron){
    //   if(object.toString().equals())
    // }
    return textsProbable;
  }
}
