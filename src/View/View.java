package View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Model.CaesarCipher;
import Model.FileService;

import java.io.IOException;
public class View {
  
  private int key;

  public View(){
    this.key = 0;
  }

  public void setVisible(boolean visible){
    if(!visible){
      return ;
    }
    int option = 0;
    String input = "";
    String text = "";
    String path = "";
    do {
      System.out.println("\t\t\t\tCifrador Caésar");
      System.out.println("\t\tEs necesario tener presente que debe proporcionar un texto");
      System.out.println("\t\t1.Cifrar.");
      System.out.println("\t\t2.Descifrar.");
      System.out.println("\t\t3.Obtener probables textos a partir del cifrado sin clave.");
      System.out.println("\t\t4.salir.");
      
    } while ( !(option >= 1 && option <= 4) );
    
    switch (option) {
      case 1:
      System.out.println("\tIngrese la dirección del archivo txt");
      path = readLine();
      System.out.println("\tPara cifrar ingrese un desplazamiento como clave");
      input = readLine();
      text = CaesarCipher.encrypt(FileService.readFile(path), Integer.parseInt(input));
      System.out.println("\tIngrese una direccion para guardar el archivo");
      path = readLine();
      FileService.writeFile(path, text);
      break;
      
      case 2:
      System.out.println("\tIngrese la dirección del archivo txt");
      path = readLine();
      System.out.println("\tPara descifrar ingrese un desplazamiento como clave");
      input = readLine();
      text = CaesarCipher.desencrypt(FileService.readFile(path), Integer.parseInt(input));
      System.out.println("\tIngrese una direccion para guardar el archivo");
      path = readLine();
      FileService.writeFile(path, text);
      break;

      case 3:
      System.out.println(text);
      break;

      
      default:
        break;
    }
    // this.key = Integer.parseInt();
  }

  private String readLine()throws IOException{
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    String input = reader.readLine();
    reader.close();
    return input;
  }

  public int getKey() {
    return key;
  }
}
