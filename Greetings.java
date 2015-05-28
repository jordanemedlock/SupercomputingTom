import java.util.Scanner;
public class Greetings{
  public static void main (String[] args){
    System.out.println ("name?");

    Scanner scanner = new Scanner(System.in);
    String name = scanner.next ();
    System.out.println ("#?");
    int num = scanner.nextInt ();
    for (int x=0; x<num; x++){
    System.out.println ("Hello " + name); 
    }
  }
}