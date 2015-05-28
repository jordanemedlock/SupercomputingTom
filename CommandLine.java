import java.util.Scanner;
public class CommandLine {
public static void main(String[] args){
System.out.println ("CommandLine args");

  for (int x=0;x<args.length;x++){
    System.out.println (args[x] );
  }

  System.out.println ("STDIN");
  Scanner scanner = new Scanner(System.in);

  while (scanner.hasNext()){
    System.out.println(scanner.next());
  }
}

}