import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.err.println("Hello World!");
    System.err.println(args[0]);
    System.err.println(args[1]);
    System.err.println(args[2]);
    try {
	    Scanner s = new Scanner(new File("Main.java"));
	    while (s.hasNext()){
	    	System.err.println(s.nextLine());
  		}
  	} catch (Exception e) {

  	}
  }
}