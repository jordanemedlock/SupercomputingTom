import java.io.File;
import java.io.PrintStream;
public class FileOutput { 

  public static void main(String[] args){

    String str = "lolololololololol";

    String filename = "blahhhhhhhhhhhhh";
    File file = new File(filename);

    PrintStream writer = null;
    try {
      writer = new PrintStream(file);
    } catch (Exception e) {
      e.printStackTrace();
    }
        writer.println(str);
    System.out.println(str);
  }
}