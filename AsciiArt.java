import java.util.Scanner;
public class AsciiArt {
	public static void main (String[] args){
	letterT();
	letterO();
	letterM();
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
}

public static void letterT() {
	System.out.println("_____________");
	System.out.println("      |      ");
	System.out.println("      |      ");
	System.out.println("      |      ");
	System.out.println("      |      ");
	System.out.println("      |      ");
	System.out.println("      |      ");
}

public static void letterO() {
	System.out.println(" ____________");
	System.out.println("| __________ |");
	System.out.println("|            |");
	System.out.println("|            |");
	System.out.println("|            |");
	System.out.println("|            |");
	System.out.println("| __________ |");
	System.out.println("|____________|");
}

public static void letterM() {
	System.out.println(" __        __");
	System.out.println("|  |      |  |");
	System.out.println("|   |    |   |");
	System.out.println("|    |__|    |");
	System.out.println("|            |");
	System.out.println("|  ||    ||  |");
	System.out.println("|__| |__| |__|");
}
}