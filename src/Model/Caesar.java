package Model;

public class Caesar implements Desencrypter{
  private String text;
  private char[] key;

  public Caesar(String text, char[] key) throws Exception{
    this.text = text;
    setKey(key);
  }

  public char[] getKey() {
    return key;
  }

  public void setKey(char[] key) throws Exception{
    if(key.length > 2){
      throw new Exception("it key only can expect two characters");
    }
    this.key = key;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String cipher(){
    return "";
  }

  @Override
  public String descipher(String textEncrypted){
    String desencrypted = "";
    return desencrypted;
  }
}
