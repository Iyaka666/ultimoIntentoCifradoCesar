package View;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class View {
  
  private char[] key;

  public void setVisible(boolean b){
    String input = "";
    
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    
    System.out.println("Cifrador Caésar");
    System.out.println("Ingrese la clave por ejemplo az");
    try{
      input = reader.readLine();
      reader.close();
    }catch(IOException ioE){
      System.out.println(ioE.getMessage());
    }
    input.toLowerCase();
    this.key = input.toCharArray();
  }

  public char[] getKey() {
    return key;
  }
}
